package linkedelist;

public class newcode {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public void traversal(node head) {
        if (head == null) {
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int insertbegg(node head, int data) {

        if (head == null) {

        }
    }
}
