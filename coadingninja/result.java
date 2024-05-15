import java.util.Scanner;

public class result {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int a = (int) ch;
        if (a <= 90 && a >= 65) {
            System.out.println(1);
        } else if (97 <= a && a < 122) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}