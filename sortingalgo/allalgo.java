package sortingalgo;

import java.util.*;

public class allalgo {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    // correct swapping function

    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, i, j);
                }
            }
        }

    }
    // ...............................................................

    // Insertion sort
    public static void Insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                {
                    swap(arr, i, j);
                    j--;
                }
            }
        }

    }

    // ........................................................
    // Selection Sort
    public static void Selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index
            // Find the minimum element in unsorted part of array
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap current element and minimum element -> current index i will have correct
            // element
            // a[min_index], a[i]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    // ..............................
    // Count Sort

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };// initialisng of the array
        // bubblesort(arr);
        // display(arr);
        Insertionsort(arr);
        display(arr);

    }
}
