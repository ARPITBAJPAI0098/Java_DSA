package Trees;

import java.util.*;

import stacks.stacks;

public class stackpreorder {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static void preoderusingstack(node root) {
        Stack<node> st = new Stack<>();
        if (root == null) {
            return;
        }
        st.push(root);
        node temp = st.peek();
        System.out.println(temp.data);
        while (st.size() > 0) {
            if (temp.left != null) {
                st.push(temp.left);
                temp.left = null;// very imp

            } else {
                if (temp.right != null) {
                    st.push(temp.right);
                    st.pop();

                }
            }

        }

    }

    public static void main(String[] args) {
        node root = new node(1);
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
        preoderusingstack(root);

    }
}