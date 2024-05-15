package Trees.generictree;

import java.io.*;
import java.util.*;

public class preinpost {
    public static class Node {
        char data;
        ArrayList<Node> children = new ArrayList<>();// here we have made the arraylist for n number of child

        public Node(char data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        Node root = new Node('A');
        (root.children).add(new Node('B'));
        (root.children).add(new Node('F'));
        (root.children).add(new Node('J'));
        (root.children.get(0).children).add(new Node('C'));// addition of element to the first child node of the parent
        (root.children.get(0).children).add(new Node('D'));
        (root.children.get(0).children).add(new Node('E'));
        (root.children.get(1).children).add(new Node('G'));
        (root.children.get(1).children).add(new Node('H'));
        (root.children.get(2).children).add(new Node('K'));
        (root.children.get(2).children).add(new Node('L'));
        (root.children.get(2).children).add(new Node('M'));
        (root.children.get(2).children).add(new Node('N'));
        (root.children.get(2).children.get(2).children).add(new Node('P'));
        (root.children.get(2).children.get(2).children).add(new Node('Q'));

        System.out.println("Preorder traversal for the tree is ");
        preorder(root);
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        for (Node node : root.children) {
            preorder(node);
        }
    }
}
