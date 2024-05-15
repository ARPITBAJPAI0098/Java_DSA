package Trees;

import java.util.*;

import org.w3c.dom.Node;

import queue.linkedlistimplement.queue;
import stacks.linkedlist2;

public class constructbst {

    public static class node {
        int val;
        node right;
        node left;

        public node(int val) {
            this.val = val;
        }
    }

    public static node constructbst(String arr[]) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        node root = new node(x);
        Queue<node> q = new LinkedList<>();
        int i = 1;
        q.add(root);
        while (i < n - 1) {
            node temp = q.remove();
            node a = new node(10);
            node b = new node(100);

            if (arr[i].equals(""))
                a = null;
            else {
                int l = Integer.parseInt(arr[i]);
                a.val = l;
                q.add(a);

            }
            if (arr[i + 1].equals(""))
                b = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                b.val = r;
                q.add(b);

            }
            temp.left = a;
            temp.right = b;
            i += 2;
        }
        return root;

    }

   

    public static void preordertraversals(node root) {// root left right
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preordertraversals(root.left);
        preordertraversals(root.right);
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
        String arr[] = { "1", "2", "3", "4", "5", "6", "" };
        node root = constructbst(arr);

        display(root);

    }
}
