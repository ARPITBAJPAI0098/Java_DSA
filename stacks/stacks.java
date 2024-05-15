package stacks;

import java.util.Stack;

//import java.sql.Array;
//import java.util.ArrayList;
// for using stack and arraylist both same time we have to write
//import java.util.*;

public class stacks {
    public static void main(String[] args) {
        //int arr[]=new int[5];
       // ArrayList<Integer> arr=new ArrayList<>(); 
       Stack<Integer> st=new Stack<>();
       st.push(3);
       st.push(4);
       st.push(7);
       // to  max element we use the peek form
       System.out.println(st.peek());
       System.out.println(st);
    }


}
