package stacks;

import java.util.Scanner;
import java.util.Stack;

public class copyinteger {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value of an integer");
        n=sc.nextInt();
        System.out.println("enter the element of an stack");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        
        // second stack
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0)
        {
            int x=st.peek();
            // you cannot use int x=st.pop()
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        System.out.println(st);
        // third stack
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0)
        {
            int x=rt.peek();
            gt.push(x);
            rt.pop();

        }
        System.out.println(gt);
        System.out.println(rt);

    
    
    
    
    }
}
