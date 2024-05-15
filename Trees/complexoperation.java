package Trees;

/* 
import java.util.*;

public class complexoperation {
    public static class complex {
        int r;
        int i;

        public complex(int r, int i) {
            this.r = r;
            this.i = i;
        }
    }

    public static void addcomplex(complex s1, complex s2) {
        int r = s1.r + s2.r;
        int i = s1.i + s2.i;
        System.out.println(r + "+" + i + "i");

    }

    public static void multiplycomplex(complex s1, complex s2) {
        int v = s1.r * s2.r;
        int u = s1.r * s2.i;
        complex s3 = new complex(v, u);
        int a = s1.i * s2.r;
        int b = s1.i * s2.i;
        complex s4 = new complex(a, b);
        addcomplex(s3, s4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        complexoperation c1=new complexoperation();
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        complex s1 = new complex(r1, i1);
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        complex s2 = new complex(r2, i2);
        int choice = sc.nextInt();
        if (choice == 1) {
            c1.addcomplex(s1, s2);
        } else if (choice == 2) {
            c1.multiplycomplex(s1, s2);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
*/
public class complexoperation {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;

        }
    }

    public static int findNode(node head, int n) {
        // Write your code here.
        int count = 0;
        node temp = head;
        while (temp != null) {
            if (temp.data == n) {
                return count;
            }
            count = count + 1;
            temp = temp.next;
        }
        return -1;
    }

    public static node appendLastNToFirst(node head, int n) {
        // Your code goes here
        if (head == null || n <= 0) {
            return head;
        }
        int count = 0;
        node pt = head;
        while (pt != null) {
            count = count + 1;
            pt = pt.next;
        }
        if (n >= count) {
            return head;
        }
        int a = count;
        int b = a - n;
        /*
         * node emp = head;
         * while (emp.next != null) {
         * emp = emp.next;
         * }
         */ // no need to do this
        pt = head;
        node st = null;
        while (b > 0) {
            st = pt;
            pt = pt.next;
            b = b - 1;

        }
        st.next = null;
        node emp = pt;
        while (pt.next != null) {
            pt = pt.next;
        }
        pt.next = head;
        return emp;
        // use of 3 pointers

    }

    public static node removeDuplicates(node head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one element, no duplicates to remove
        }
        node temp = head;
        node st = temp.next;
        while (temp.next != null) {
            if ((temp.data) == (st.data)) {
                temp.next = st.next;
                st = st.next;

            }
            temp = temp.next;
            st = st.next;
        }
        return head;
    }

    public static node mergeTwoSorteds(node head1, node head2) {
        // Your code goes here
        node temp = head1;
        node st = temp.next;
        node emp = head2;
        if (head1 == null && head2 != null) {
            return head2;
        }
        if (head1 == null && head2 != null) {
            return head1;
        }
        while (st.next != null || emp != null) {
            if (emp.data > temp.data && emp.data < st.data) {
                temp.next = emp;
                emp = emp.next;
                temp.next.next = st;
                temp = temp.next;

            }
            if (st.next == null) {
                st = emp;
            }
            if (temp.data > emp.data) {
                temp.next = emp;
                emp = emp.next;
                temp.next.next = temp;
                temp.next = st;
            }
            temp = temp.next;
            st = st.next;

        }
        return temp;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // node temp = appendLastNToFirst(a, 2);
        node temp = removeDuplicates(a);
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}