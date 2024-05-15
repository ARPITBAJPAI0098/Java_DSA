package graph;

import java.util.*;

public class ownimplementationbjfs {

    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean isvisited[] = new boolean[v + 1];
        ArrayList<Integer> ls = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        isvisited[0] = true;// assisgning the true thats why single =
        while (que.size() > 0) {
            int temp = que.poll();
            ls.add(temp);

            for (int it : adj.get(temp)) {
                if (isvisited[it] == false) {// here comaparing thats why two ==
                    isvisited[it] = true;
                    ls.add(it);
                }
            }
        }
        return ls;
    }

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> ls) {

        // marking current node as visited
        vis[node] = true;
        ls.add(node);

        // getting neighbour nodes
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> dfs(int v, ArrayList<ArrayList<Integer>> adj){
        boolean bl[]=new boolean[v+1];
        bl[0]=true;
        ArrayList<Integer>ls=new ArrayList<>();
        dfs(0,bl,adj,ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<Integer>());// additon of 5 arraylist
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(0).add(4);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(3).add(0);
        adj.get(4).add(1);
        adj.get(2).add(1);
        ArrayList<Integer> ans = bfs(5, adj);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
