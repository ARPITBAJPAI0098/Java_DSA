public class houserobber {
    import java.util.*;

public class Solution {
    public static int nonadjacent(int idx, int valueInHouse[], int[] dp, ArrayList<Integer> nums) {
        if (idx == 0) {
            return nums.get(idx);
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int pick = nums.get(idx) + nonadjacent(idx - 2, valueInHouse, dp, nums);
        int notpick = nonadjacent(idx - 1, valueInHouse, dp, nums);
        return dp[idx] = Math.max(pick, notpick);
    }

    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 1) {
            return valueInHouse[0];
        }

        // Rob first house to last - 1 house
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            nums1.add(valueInHouse[i]);
        }
        long max1 = nonadjacent(n - 2, valueInHouse, dp1, nums1);

        // Rob second house to last house
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            nums2.add(valueInHouse[i]);
        }
        long max2 = nonadjacent(n - 2, valueInHouse, dp2, nums2);

        return Math.max(max1, max2);
    }
}

}
