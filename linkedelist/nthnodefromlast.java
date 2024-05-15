package linkedelist;

public class nthnodefromlast {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }

    }

    public static void nthnode(node head, int data) {
        int size = 0;
        node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = (data - size + 1);
        node rtn = head;
        node ptr = head.next;
        for (int i = 0; i <= m - 1; i++) {
            rtn = rtn.next;
            ptr = ptr.next;
        }
        rtn.next = ptr.next;
        ptr.next = null;

    }

    public static node nthnode2(node head, int n) {
        node slow = head;
        node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static node deletenthnodefromend(node head, int n) {
        node slow = head;
        node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = fast;
        return head;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        node head = new node(5);
        node b = new node(6);
        node c = new node(7);
        node d = new node(8);
        head.next = b;
        b.next = c;
        c.next = d;
        nthnode(head, 2);
        display(head);

    }
}
