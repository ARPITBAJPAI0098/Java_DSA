package heap;

import java.util.ArrayList;
import java.util.List;

public class implemetation {
    // swap function (important as it is perform in another way)
    static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    /*
     * static void insert_in_minheap(List<Integer> heap, int element) {
     * // last me add
     * heap.add(element);
     * // index
     * int i = heap.size() - 1;
     * push_up_in_minheap(heap, i);
     * 
     * }
     * 
     * static void push_up_in_minheap(List<Integer> heap, int i) {
     * // means no element
     * // pi=parent index
     * int pi = (i - 1) / 2;
     * if (i == 0 || heap.get(pi) < heap.get(i)) {
     * return;
     * } else {
     * swap(heap, i, pi);
     * }
     * push_up_in_minheap(heap, pi);
     * 
     * }
     */

    static void display(List<Integer> heap) {
        int size = heap.size();
        for (int i = 0; i < size; i++) {
            System.out.println(heap.get(i));
        }

    }

    // ***...................................................... */
    // insertion in max heap
    static void insert_in_maxheap(List<Integer> heap, int element) {
        // last me add
        heap.add(element);
        // index
        int i = heap.size() - 1;
        push_up_in_maxheap(heap, i);

    }

    static void push_up_in_maxheap(List<Integer> heap, int i) {
        // means no element
        // pi=parent index
        int pi = (i - 1) / 2;
        if (i == 0 || heap.get(pi) > heap.get(i)) {
            return;
        } else {
            swap(heap, i, pi);
        }
        push_up_in_maxheap(heap, pi);

    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        /*
         * heap.add(10);
         * heap.add(20);
         * heap.add(30);
         * heap.add(40);
         * heap.add(50);
         * System.out.println(heap);
         */
        // till here we have make the array
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        // insert_in_minheap(heap, 5);
        insert_in_maxheap(heap, 40);
        display(heap);

    }
}
