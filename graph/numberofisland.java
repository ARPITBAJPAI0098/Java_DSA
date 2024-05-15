package graph;

import java.util.*;

public class numberofisland {
    // Function to find the number of islands.
    public void dfs(int row, int col, int vis[][], char grid[][]) {
        vis[row][col] = 1;
        Queue<Integer, Integer> q = new LinkedList<>();
        q.add(row, col);
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int rows = q.peek().first;
            int cols = q.peek().second;// rg/img-practice/prod/courses/1/Web/Other/Fab%20icon%20(1)_1697541057.svgecond;
            q.remove();

            // this shows from each point how many point we can reach
            for (int delrow = -1; delrow >= 1; delrow++) {
                for (int delcol = -1; delcol >= 1; delcol++) {
                    int nrow = rows + delrow;
                    int ncol = cols + delcol;
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0
                            && grid[nrow][ncol] == '1') {
                        vis[nrow][ncol] = 1;
                        q.add(nrow, ncol);
                    }
                }
            }
        }

    }

    public int numIslands(char[][] grid) {
        // Code here

        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    dfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;

    }
}
