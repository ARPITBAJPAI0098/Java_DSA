package backtracking;

public class ratinmaze {
    public static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er && sc == ec) {
            return 1;
        }
        int downways = maze(sr + 1, sc, er, ec);
        int rightways = maze(sr, sc + 1, er, ec);
        int total_ways = downways + rightways;
        return total_ways;

    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int count = maze(1, 1, rows, columns);
        System.out.println(count);
    }
}
