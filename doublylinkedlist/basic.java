package doublylinkedlist;

// static is written to access the element outside of say intermediate class
//but within the main class
public class basic {
    public static class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
        }
    }

    public static void displaydb(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displaydbrev(node tail) {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void displayrndm(node random) {
        node temp = random;
        // random node position se head tak lekegae then print karwaya
        while (temp.prev != null) {
            temp = temp.prev;

        }
        // now temp is at node
        // print the element
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static node insertathead(node head, int n) {
        node temp = new node(100);
        if (head == null) {
            temp = head;

        }
        temp.next = head;
        head.prev = temp;
        temp = head;
        return head;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        a.next = b;
        a.prev = null;// no need to write this as by default null hota hai
        b.prev = a;
        b.next = null;
        displaydb(a);
        displaydbrev(b);

    }
}
 