package backtracking;

public class printpath {
    public static void print(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return; // as after each full iteration you have to exit anb start from the starting
        }

        // go down
        // imp
        print(sr + 1, sc, er, ec, s + "D");
        print(sr, sc + 1, er, ec, s + "R");
        // on the baiss of calling the order of pattern changes but all output will
        // remain same
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        print(1, 1, rows, columns, "");
    }
}
