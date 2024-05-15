import java.util.Scanner;

public class suminput {

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the inputs of the thre numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sum(a, b, c);

    }
}
