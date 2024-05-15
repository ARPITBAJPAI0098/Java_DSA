package queue;

import java.util.LinkedList;
import java.util.Queue;

public class helper {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(null);
        // you can take te user input or can do following
        q.add(1);
        q.add(2);
        q.add(2);
        System.out.println(q);
        Queue<Integer> helpers = new LinkedList<>(null);
        while (q.size() > 0) {
            int x = q.remove();
            helpers.add(x);

        }
        System.out.println(helpers);
        while (helpers.size() > 0) {
            q.add(helpers.poll());
        }
    }
}
