// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class basicstl {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(43);
        q.add(67);
        q.add(88);

        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        // this is the first in anbd first out
        // q.poll also remove the things
        // here peak is the first element
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}