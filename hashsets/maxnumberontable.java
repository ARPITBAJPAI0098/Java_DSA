package hashsets;

import java.util.HashSet;

public class maxnumberontable {
    public static int maxnumberontables(int bag[]) {
        // here table is the set
        HashSet<Integer> st = new HashSet<>();
        int count = 0;
        for (int num : bag) {
            if (st.contains(num)) {
                st.remove(num);

            } else {
                st.add(num);
                count = Math.max(count, st.size());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 3, 2, 3 };
        System.out.println(maxnumberontables(nums));
    }
}
