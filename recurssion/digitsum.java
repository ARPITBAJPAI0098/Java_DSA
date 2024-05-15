package recurssion;

public class digitsum {
    public static int digiad(int n) {
        // base case
        if (n >= 0 && n <= 9) {
            return n;
        }
        // recursive work
        return digiad(n/10)+n%10;

    }

    public static void main(String[] args) {
        digiad(1234);
    }
}
