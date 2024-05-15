package circularqueue;

public class implementation {
    public static class circularqueue {
        int r = -1;
        int f = -1;
        int size = 0;
        private int arr[] = new int[8];

        public void add(int data) throws Exception {
            // see the changement from the normal queue
            if (size == arr.length) {
                // System.out.println("circular queue is full");
                // another way to print is as follows
                throw new Exception("queue is full");
                // return;
            } else if (size == 0) {
                f = r = 0;
                arr[f] = data;

            } else if (r < arr.length - 1) {// normal case
                arr[++r] = data;
            } else if (r == arr.length - 1) {
                arr[0] = data;
                r = 0;

            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("circular queue is empty");
            } else {
                int val = arr[f];
                if (f == arr.length - 1) {
                    f = 0;

                } else {

                    f++;
                }
                size--;
                return val;

            }

        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("circular queue is empty");
            } else {
                return arr[f];
            }
        }

        public boolean isEmpty() {
            if (size == 0) {
                return false;

            } else {
                return true;
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else if (f <= r) {
                // means rear age hai front se just like the normal case
                for (int i = f; i <= r; i++) {
                    System.out.println(arr[i] + " ");
                }
            } else if (f > r) {
                for (int i = f; i <= arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception// throws Exception
    {
        circularqueue q = new circularqueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();

    }
}