/* 
package backtracking;

public class Solution {
  
    
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        return canReachHelper(sx, sy, fx, fy, t);
    }

    private boolean canReachHelper(int x, int y, int fx, int fy, int t) {
        if (t < 0) {
            return false;
        }

        if (x == fx && y == fy) {
            return true;
        }
        int xdis = Math.abs(x - fx);
        int ydis = Math.abs(y - fy);
        if (xdis == 0 && ydis == 0 && t == 1) {
            return false;
        }
        
        
        int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
        int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (canReachHelper(nx, ny, fx, fy, t - 1)==true) {
                return true;
            }
            else if(canReachHelper(nx, ny, fx, fy, t - 1)==true)
            {
        }
        }

        return false;
    }

    
}

what is the error in the above code
*/
