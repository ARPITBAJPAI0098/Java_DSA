package stacks;

import java.util.Stack;

import java.util.Scanner;

public class displaystackrecur {

    public static void displayrecurive(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int top = s.pop();
        System.out.println(top + " ");
        displayrecurive(s);
        // at last push all elemnt in the stack
        s.push(top);

    }
    

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of an integer");
        n = sc.nextInt();
        System.out.println("enter the element of an stack");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        displayrecurive(st);
    }

    /*
     * st.push(1);
     * st.push(1);
     * st.push(1);
     * st.push(1);
     * displayrecurive(st);
     */

}