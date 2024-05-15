package stacks;

import java.util.Stack;

public class bottompushreverse {
    public static void pushatbottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushatbottom(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushatbottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        reverse(st);

    }
}
// question to discuss