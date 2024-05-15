package hashsets;

import java.util.HashSet;

public class largestconsecutive {
    public static int longest_consecutive(int nums[]) {
        HashSet<Integer> st = new HashSet<>();
        // convert into the sets so
        for (int num : nums) {
            st.add(num);
        }
        int start;
        int longeststreak = 1;

        for (int num : st) {
            if (st.contains(num - 1)) {
                start = num;
                int currentStreak = 0;
                while (st.contains(start + 1)) {
                    start += 1;
                    currentStreak++;
                }
                longeststreak = Math.max(longeststreak, currentStreak);
            }
        }
        return longeststreak;

    }

    public static void main(String[] args) {
        int nums[] = { 100, 1000, 200, 1, 2, 3, 4 };
        int a = longest_consecutive(nums);
        System.out.println(a);

    }
}
