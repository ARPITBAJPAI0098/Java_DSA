package stacks;

import java.util.Scanner;
import java.util.Stack;

public class removeanyindex {
    static Scanner sc = new Scanner(System.in);

    public static void stackformation(int n) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            System.out.println("enter the inputs");
            int x = sc.nextInt();
            s.push(x);
        }
    }

    public static void displayrecurive(Stack<Integer> s) {
        Stack<Integer> st = new Stack<>();
        if (s.size() == 0) {
            return;
        }
        while (s.size() == 1) {
            int x = s.pop();
            st.push(x);
            System.out.println(x + "");
            displayrecurive(s);

            s.push(x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int n = sc.nextInt();
        stackformation(n);
        displayrecurive(s);

    }

}
