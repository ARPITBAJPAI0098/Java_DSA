package stacks;

// here we not from the inbuilt stack but we make the structurer based stack as we learned in the case of linkedlist
public class arrayimplement {
    public static class Stack {
        int n = 6;
        private int arr[] = new int[n];
        private int idx = 0;

        void push(int x) {

            arr[idx] = x;
            idx++;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }

        int pop() {
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;

        }

        int size() {
            return idx;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        boolean isEmpty() {
            if (idx == 0) {
                return true;
            } else {
                return false;
            }

        }

        boolean isFull() {
            // as after filling of an array the idx will be updatd
            if (idx == n) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(12);
        st.push(45);
        st.display();
        System.out.println(st.isEmpty());// donot confuse here here we put the 6 inputs so it shold show isempty false
                                         // and isfull true
        // because we also done the pop operation one time
        System.out.println(st.isFull());
    }
}