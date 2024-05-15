package backtracking;

public class permutation {
    public static void print(String s, String t) {
        // do not compare in string likethis if (s == "")
        if (s.equals("")) {
            System.out.println(t);
            return;
        }
        // as long as the length of string that much time recursive call ioccur
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            String rem = left + right;
            print(rem,  t+ch);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        print(str, "");
    }

}
