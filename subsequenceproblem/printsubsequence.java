
import java.util.ArrayList;
import java.util.List;

public class printsubsequence {
    public static List<String> generateSubsequences(String s) {
        // Base case
        if (s.length() == 0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        // Recursive case
        List<String> smallAns = generateSubsequences(s.substring(1));
        List<String> ans = new ArrayList<>(2 * smallAns.size());

        // Copy the initial elements
        ans.addAll(smallAns);

        // Append the current character to each element in smallAns
        char firstChar = s.charAt(0);
        for (String smallStr : smallAns) {
            ans.add(firstChar + smallStr);
        }

        return ans;
    }
}
