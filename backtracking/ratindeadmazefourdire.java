package backtracking;

//public List<List<Integer>> permute(int[] nums) it is the return type of 2Darraylist
public class ratindeadmazefourdire {
    public static void print(int sr, int sc, int er, int ec, String s, int maze[][], boolean isvisited[][]) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (sr < 0 || sc < 0) {
            return;
        }
        if (maze[sr][sc] == 0) {
            return;
        }
        // check for no repetiton along up and down side
        if (isvisited[sr][sc] == true) {
            return;
        }
        isvisited[sr][sc] = true;
        print(sr + 1, sc, er, ec, s + "D", maze, isvisited);
        print(sr, sc + 1, er, ec, s + "R", maze, isvisited);
        print(sr, sc - 1, er, ec, s + "L", maze, isvisited);
        // go up
        print(sr - 1, sc, er, ec, s + "U", maze, isvisited);
        // backtracking;
        isvisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int row = 4;
        int column = 6;
        int maze[][] = { { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 0, 0, 1, 0, 1, 1 } };
        boolean isvisited[][] = new boolean[row][column];
        print(0, 0, row - 1, column - 1, "", maze, isvisited);

        // boolean isvisited[][] = new boolean[row - 1][column - 1];
        // we cannot write row-1 or column-1 beacause if row-1=sr and when sr=er
        // that means rows=er+1 which is out of bound

        // here we are using space complexity ==n*m where n is the order of the matrix
        // maze
        // while m is the order of the matrix boolean
    }
}
/*
 * // for space complexity use==n use optimised code given below
 * /*public static void print(int sr, int sc, int er, int ec, String s, int
 * maze[][]) {
 * if (sr > er || sc > ec) {
 * return;
 * }
 * if (sr == er && sc == ec) {
 * System.out.println(s);
 * return;
 * }
 * if (sr < 0 || sc < 0) {
 * return;
 * }
 * if (maze[sr][sc] == 0) {
 * return;
 * }
 * // check for no repetiton along up and down side
 * if (maze[sr][sc] == -1) {
 * return;
 * }
 * maze[sr][sc] = -1;
 * print(sr + 1, sc, er, ec, s + "D", maze);
 * print(sr, sc + 1, er, ec, s + "R", maze);
 * print(sr, sc - 1, er, ec, s + "L", maze);
 * // go up
 * print(sr - 1, sc, er, ec, s + "U", maze);
 * // backtracking;
 * maze[sr][sc] = 1;
 * }
 */