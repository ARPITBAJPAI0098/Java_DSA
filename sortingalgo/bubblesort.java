package sortingalgo;

import java.util.Scanner;

public class bubblesort

{

    public static void bully(int arr[], int n) {

        int temp;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1])

                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }

        }
    }

    public static void display(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];// declaration of array
        for (int i = 0; i < n; i++) {
            System.out.println("enter the inputs");
            arr[i] = sc.nextInt();

        }
        // display(n, arr);
        bully(arr, n);
        display(n, arr);

    }
}
