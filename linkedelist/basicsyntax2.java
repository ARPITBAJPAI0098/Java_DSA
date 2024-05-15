package linkedelist;

public class basicsyntax2 {

    public static class node {
        int data;
        node link;

        node(int data) {
            this.data = data;
            link = null;
        }
    }

    public static void lengthlinked(node head) {
        if (head == null) {
            return;

        }
        node ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.link;
        }
        System.out.println(count);
    }

    public static node reversell(node head) {
        node temp = head.link;
        node curr = head;
        node prev = null;
        while (curr != null) {
            curr.link = prev;
            prev = curr;
            curr = temp;
            if (temp != null) {

                temp = temp.link;
            }
        }
        return curr;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }

    }

    public static void main(String[] args) {
        node head = new node(1);
        node a = new node(2);
        node b = new node(3);// assigning that the pointer of the respective node ppint to the particxular
                             // node only
        head.link = a;
        a.link = b;
        lengthlinked(head);
        reversell(head);
        displ
    }

}
