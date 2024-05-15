import java.util.*;

// must have a knowledge of difference between subarray and subsequences
public class printsubsequencesinteger {
    public static void printintegersubsequences(int arr[], ArrayList<Integer> sd, int n, int idx) {
        if (idx >= n) {
            for (int el : sd) {
                System.out.println(sd);
                return;
            }
        }
        if (sd.size() == 0) {
            System.out.println("empty");
        }
        sd.add(arr[idx]);
        printintegersubsequences(arr, sd, n, idx + 1);
        sd.remove(n - 1);// check for it
        printintegersubsequences(arr, sd, n, idx + 1);

    }

    public static void main(String[] args) {

    }
}
