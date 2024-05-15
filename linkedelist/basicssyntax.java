package linkedelist;

public class basicssyntax {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    // program to find the length of the linkedlist
    public static void lengthlinked(node head) {
        node ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        System.out.println("the length of the link ed list is " + count);
    }

    public static void displayrecur(node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        displayrecur(head.next);
    }

    public static void displayreverse(node head) {
        if (head == null) {
            return;
        }
        displayreverse(head.next);
        System.out.println(head.data + " ");
        // isme last tak traverse higa and function get filled in order in stack now
        // after reaching last node return null come therfore print start from last
        // function(i.e the top most of the function)
    }

    public static void linkedlisttraverse(node head) {
        node qtr = head;// pointer that will point to the node
        while (qtr != null) {
            System.out.println(qtr.data);
            qtr = qtr.next;
        }

    }

    public static node insertbeg(node head, int data) {
        node gtnr = new node(7);
        gtnr.data = data;
        if (head == null) {
            gtnr.next = null;
            head = gtnr;

        } else {
            gtnr.next = head;
            head = gtnr;
        }
        return head;
    }

    public static void main(String[] args) {
        // making of an object of class node
        /*
         * node head=new node(5);
         * System.out.println(head.data);// acesin to the node part
         * System.out.println(head.next);
         * 
         * //linkage
         * 
         * node ptr=new node(8);
         * head.next=ptr;
         * System.out.println(ptr.data);
         * System.out.println(head.next.data);// link form
         */

        node head = new node(5);
        node ptr = new node(8);
        head.next = ptr;
        // linkedlisttraverse(head);
        insertbeg(head, 7);
        // linkedlisttraverse(head);
        displayrecur(head);
        displayreverse(head);
        lengthlinked(head);
    }
}
// recursively printing all the data of the