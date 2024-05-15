package stacks;

public class linkedlist2 {
    public class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public void push(int x, node head) {
        node temp = new node(x);
        if (head == null) {
            temp = head;
        }
        head.next = temp;
        head = temp;

    }
}
