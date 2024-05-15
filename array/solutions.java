
import java.util.Scanner;

public class solutions {

    public static int findUnique(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int x;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                }
                break;

            
            }
            
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        findUnique(arr);

    }
}
