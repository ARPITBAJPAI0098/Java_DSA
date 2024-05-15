package queue;

import java.util.*;

public class arrayimplement {
    public static class Queue {
        int f = -1;
        int r = -1;
        int size = 0;
        private int arr[] = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[r] = val;
            } else {
                arr[++r] = val;
            }
            // soze lo bhi ncrease krdiya karo
            size++;
        }

        public int remove() {
            if (size == 0) {
                return -1;
            } else {
                f++;
                size--;
                return arr[f - 1];
            }
        }

        public int peek() {
            if (size == 0) {
                return -1;
            } else {
                return arr[f];
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("empty");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.display();
        q.add(6);
        q.display();
    }
}
