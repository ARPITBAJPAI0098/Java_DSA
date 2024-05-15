package Trees;

import java.util.*;

public class implementation {
    public static class node {
        int val;
        node left;// intially null
        node right;// intially null

        node(int val) {
            this.val = val;
        }
    }

    public static void display(node root) {
        if (root == null)

        {
            return;
        }
        System.out.print(root.val + "-> ");
        if (root.left != null) {
            System.out.print(root.left.val + ",");
        } else {
            System.out.print("null ,");
        }
        if (root.right != null) {
            System.out.print(root.right.val + " ");
        } else {
            System.out.print("null");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

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
        display(root);

    }
}