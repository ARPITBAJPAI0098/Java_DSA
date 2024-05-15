package stacks;

public class linkedlisrtimplementationofstack {

    public static class node// user defined data type
    {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class llstack {

        int size = 0;
        node head = null;

        void push(int x) {
            node temp = new node(x);
            temp.next = head;
            head = temp;
        }

        // doubt in tis function
        /*
         * int pop()
         * {
         * node ptr=head;
         * node q=head.next;
         * while(q.next!=null)
         * {
         * q=q.next;
         * ptr=ptr.next;
         * 
         * }
         * ptr.next=null;
         * q=null;
         * return;
         * }
         */
        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;

        }

        int size() {
            return size;
        }

        void display() {
            node ret = head;// integer value will become wuate with 0.... the node value will equate with
                            // null
            if (ret == null) {
                System.out.println("");
            }
            while (ret != null) {
                System.out.println(ret.data);
                ret = ret.next;
            }
        }
        // think of it how to make
        /*
         * void displayreverse() {
         * node ter = head;// integer value will become wuate with 0.... the node value
         * will equate with
         * // null
         * if (ret == null) {
         * System.out.println("");
         * }
         * while (ret != null) {
         * System.out.println(ret.data);
         * ret = ret.next;
         * }
         */
    }

    public static void main(String[] args) {
        llstack st = new llstack();
        st.push(45);
        st.push(20);
        st.push(21);
        st.display();
        System.out.println(st.size);

    }

}
