package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import queue.linkedlistimplement.queue;

public class BFSimplement {

    public ArrayList<Integer> bfsgraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean isvisited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        isvisited[0] = true;
        while (q.size() > 0) {
        
            int temp = q.poll();
            bfs.add(temp);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (int el : adj.get(temp)) {
                if (isvisited[el] == false) {
                    isvisited[el] = true;
                    q.add(el);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {
        // making of the adjancy list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        // formation of the arraylist of arays
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(0).add(4);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(3).add(0);
        adj.get(4).add(1);
        adj.get(2).add(1);
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < adj.get(i).size(); j++) {
        // System.out.print(adj.get(i).get(j));
        // }
        // System.out.println();
        // }
        BFSimplement s1 = new BFSimplement();
        ArrayList<Integer> ans = s1.bfsgraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
