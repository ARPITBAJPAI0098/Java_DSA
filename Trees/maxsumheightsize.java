package Trees;

import java.util.LinkedList;
import java.util.*;

public class maxsumheightsize {

    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static int size(node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public static int sum(node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    public static int max1(node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.data, Math.max(max1(root.left), max1(root.right)));
    }

    public static int height(node root) {
        if (root == null) {
            // return -1; else write only -1
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;// as wo apne aap me ek root hai
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthleveltraversal(node root, int n) {
        if (root == null) {
            return;
        }
        // size++;
        if (n == 1) {
            System.out.print(root.data + " ");
        }

        nthleveltraversal(root.left, n - 1);
        nthleveltraversal(root.right, n - 1);
    }

    // implementation of the level order traversal using the queue data structure
    // also said to be the BFS
    public static void bfs(node root) {// iteration
        Queue<node> q = new LinkedList<>(null);
        if (root != null) {
            q.add(root);
        }
        while (q.size() > 0) {
            node temp = q.peek();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.println(temp.data + " ");
            q.remove();
        }
    }
    /*
     * public static int maxsumheighttree(node root){
     * if(root==null)
     * {
     * return 0;
     * }
     * return
     * 
     * 
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        node root = new node(1);
        // without the use of the constructor
        /*
         * root.val = 6;
         * System.out.println(root.val);
         */
        node a = new node(2);
        node b = new node(3);
        root.left = a;
        root.right = b;
        node c = new node(4);
        node d = new node(5);
        node e = new node(6);
        a.left = c;
        a.right = d;
        b.right = e;
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max1(root));
        System.out.println(height(root));
        System.out.println();
        int level = height(root) + 1;
        /*
         * for (int n = 1; n <= level; n++) {
         * nthleveltraversal(root, n);
         * System.out.println();
         * 
         * }
         * System.out.println("printing of element using queue");
         * bfs(root);
         */
        height(root);
    }
}
