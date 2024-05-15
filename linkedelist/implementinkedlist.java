package linkedelist;

import java.util.LinkedList;

// java also has an internal linkedlist
public class implementinkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(null);
        ll.add(4);
        ll.add(13, null);
        System.out.println(ll);

    }

    /*
     * import java.util.LinkedList;
     * import java.util.Iterator;
     * 
     * public class LinkedListIterationExample {
     * public static void main(String[] args) {
     * LinkedList<String> linkedList = new LinkedList<>();
     * linkedList.add("Apple");
     * linkedList.add("Banana");
     * linkedList.add("Orange");
     * 
     * // Iterating using for-each loop
     * for (String fruit : linkedList) {
     * System.out.println(fruit);
     * }
     * 
     * // Iterating using Iterator
     * Iterator<String> iterator = linkedList.iterator();
     * while (iterator.hasNext()) {
     * System.out.println(iterator.next());
     * }
     * }
     * }
     */

}
