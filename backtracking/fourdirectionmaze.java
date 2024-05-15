package backtracking;

public class fourdirectionmaze {
    public static void print(int sr, int sc, int er, int ec, String s, boolean isvisited[][]) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr < 0 || sc < 0) {
            return;
        }
        if (isvisited[sr][sc] == true) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return; // as after each full iteration you have to exit anb start from the starting
        }

        // agr ek bar upar chala gya to niche nhi ana hai warnba
        // wo infinite tak chalta rahega
        // so now applying check and if we visited any (row,col) we make it true
        // mtlb stamp lagadeinge ki ham yaha achuke hai ye tabtak kareinge jabtak ending
        // tak nhi pahuch jate
        // jaise hi ek iteration ho jae stamp harado warna wo rasta hamesha kelie band
        // hojega
        // firstly make true
        isvisited[sr][sc] = true;

        // go down
        // imp
        print(sr + 1, sc, er, ec, s + "D", isvisited);
        // go right
        print(sr, sc + 1, er, ec, s + "R", isvisited);
        // on the baiss of calling the order of
        // pattern changes but all output will remain same
        // go left

        print(sr, sc - 1, er, ec, s + "L", isvisited);
        // go up
        print(sr - 1, sc, er, ec, s + "U", isvisited);
        // backtraking
        isvisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        boolean[][] isvisited = new boolean[row][column];
        // instead of it
        // print(1, 1, row, column, "",isvisited);
        // use
        print(0, 0, row - 1, column - 1, "", isvisited);

    }
}
// it is going infinte if not using
