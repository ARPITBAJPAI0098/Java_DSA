package collectionframework;

import java.util.*;

public class listinterface {

    public static void arraylistexample() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.get(1));
        arr.set(0, 4);
        System.out.println(arr);
    }
    public static void linkedlistexample() {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.get(1));
        arr.set(0, 4);
        System.out.println(arr);
    }
    // for stack push ;put; pop

    public static void main(String[] args) {
        arraylistexample();
        linkedlistexample();
    }
}
