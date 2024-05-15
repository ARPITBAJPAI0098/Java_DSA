package graph;

import java.util.*;

public class transitiveclosure {


    public static void dfs(int grid[][], int root, int current, int n, int vis[][]) {
        vis[root][current] = 1;

        for (int neighbor = 0; neighbor < n; neighbor++) {
            if (grid[current][neighbor] == 1 && vis[root][neighbor] == 0) {
                dfs(grid, root, neighbor, n, vis);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 0, 1 }, { 0, 1, 1, 0 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1 } };

        int n = grid.length;
        int vis[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (vis[i][k] == 0 && grid[i][k] == 1) {
                    dfs(grid, i, k, n, vis);
                }
            }
        }

        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[i].length; j++)
                System.out.print(vis[i][j] + " ");
            System.out.println();
        }
    }
}




