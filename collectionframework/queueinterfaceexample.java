package collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class queueinterfaceexample {
    static void priorityqueueExample(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();// first element will be minimum
    // for max first element
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(3);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
