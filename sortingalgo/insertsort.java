import java.util.*;

public class insertsort {
    static void insertionSorting(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;// we are doing this so that the entire minimum get comparred to the rest of the
                    // values
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 6, 5, 4, 2 };

        insertionSorting(a);
        for (int el : a) {
            System.out.print(el + " ");
        }
    }
}