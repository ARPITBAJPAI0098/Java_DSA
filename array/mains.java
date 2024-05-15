
import java.util.Scanner;

public class mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input first array
    System.out.print("Enter the size of the first array: ");
    int n = input.nextInt();
    int firstArray[] = new int[n];
    System.out.println("Enter the elements of the first array:");
    for (int i = 0; i < n; i++) {
      firstArray[i] = input.nextInt();
    }

    // Input second array
    System.out.println("Enter the size of the second array: ");
    int m = input.nextInt();
    int secondArray[] = new int[m];
    System.out.println("Enter the elements of the second array:");
    for (int i = 0; i < m; i++) {
      secondArray[i] = input.nextInt();
    }

    // Print the arrays
    System.out.println("First array:");
    for (int i = 0; i < n; i++) {
      System.out.print(firstArray[i] + " ");
    }
    System.out.println();
    System.out.println("Second array:");
    for (int i = 0; i < m; i++) {
      System.out.println(secondArray[i] + " ");
    }
  }
}

// wecan directly use the arr.length to find the size of an array

