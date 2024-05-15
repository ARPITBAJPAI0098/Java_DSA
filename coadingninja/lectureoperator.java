package coadingninja;

import java.util.Scanner;

public class lectureoperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        int cel = (int) ((5.0 / 9) * (f - 32));
        System.out.println(cel);
        // explicit conversion of the double value intio the integer value
    }
}
