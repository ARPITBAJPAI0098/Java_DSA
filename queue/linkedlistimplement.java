package queue;

public class linkedlistimplement {
    public static class node {// user defined data structure
        node next;
        int data;

        node(int data) {
            this.data = data;
        }
    }

    public static class queue {
        node head = null;
        node tail = null;
        int size = 0;

        public void add(int data) {
            node temp = new node(data);
            if (size == 0) {

                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;

        }

        public int remove(int data) {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;

            } else {
                int x = head.data;
                head = head.next;
                size--;
                return x;// retrun wil be done at last

            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public void display() {
            node temp = head;
            if (size == 0) {
                System.out.println("queue is empty");
            } else {

                while (temp != null) {
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
            }
            System.out.println();// for prnyting of the line
        }

        public boolean isEmpty() {
            if (size == 0) {
                // System.out.println("true"); isempty function return the result
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display();
        q.remove(4);
        q.display();
    }
}
// in case of queue
// head is act as the 1>deletion
// 2>peek

// tail is used for the linkage