import java.util.*;

public class maxfrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 6 };
        HashMap<Integer, Integer> HP = new HashMap<>();
        // for ech loop
        for (int el : arr) {
            if (!HP.containsKey(el)) {
                HP.put(el, 1);
            } else {
                HP.put(el, HP.get(el) + 1);
            }
        }
        System.out.println("frequency map");
        System.out.println(HP.entrySet());
        int maxfreq = -1;
        int anskey = -1;
        // anoter way
        /*
         * for (var e : HP.entrySet()) {
         * if (e.getValue() > maxfreq) {
         * maxfreq = e.getValue();
         * anskey = e.getKey();
         * }
         * }
         */

        for (var key : HP.keySet()) {
            if (HP.get(key) > maxfreq) {
                maxfreq = HP.get(key);
                anskey = key;
            }
        }

        System.out.println(anskey);
    }
}
/*
 * here is a program to find frequency of element in an array
 * import java.util.*;
 * 
 * public class FrequencyInArray {
 * public static void main(String[] args) {
 * // Sample array
 * int[] array = {1, 2, 3, 4, 1, 2, 1, 3, 2};
 * 
 * // Element to find frequency for
 * int element = 1;
 * 
 * // Counter variable to store the frequency
 * int frequency = 0;
 * 
 * // Iterate over the array
 * for (int i = 0; i < array.length; i++) {
 * if (array[i] == element) {
 * frequency++;
 * }
 * }
 * 
 * System.out.println("Frequency of " + element + " in the array is: " +
 * frequency);
 * }
 * }
 */
