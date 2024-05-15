package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;


public class dequeueinterface {
    static void priorityqueueExample(){
       Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(3);
        dq.addLast(4);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
    }
}
