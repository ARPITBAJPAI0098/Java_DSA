
//import java.util.ArrayDeque;
//import java.util.Deque;
import java.util.*;
//import java.util.LinkedList;
// RAMBAD PUT IMPORT.UTIL.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>(null);
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

    }
}
/*
 * package deque;
 * 
 * import java.util.ArrayDeque;
 * import java.util.Deque;
 * import java.util.LinkedList;
 * 
 * public class implementation {
 * public static void main(String[] args) {
 * Deque<Integer> dq=new ArrayDeque<>(null);
 * 
 * }
 * }
 */
