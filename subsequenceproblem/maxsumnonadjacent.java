public class maxsumnonadjacent {
    import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int nonadjacent(int idx, ArrayList<Integer> nums, int[] dp) {
        if (idx == 0) {
            return nums.get(idx);
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int pick = nums.get(idx) + nonadjacent(idx - 2, nums, dp);
        int notpick = nonadjacent(idx - 1, nums, dp);
        return dp[idx] = Math.max(pick, notpick);
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return nonadjacent(n - 1, nums, dp);
    }

}
