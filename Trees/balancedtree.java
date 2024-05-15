package Trees;

public class balancedtree {
    {
        public static int height(TreeNode root) {
    
            if (root == null || (root.left == null && root.right == null)) {
                return 0;
            }
    
            return 1 + Math.max(height(root.left), height(root.right));
        }
        public boolean isBalanced(TreeNode root) {
            if(root==null)
            {
                return true;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int d=lh-rh;
            if(d>1){
                return false;
            }
            if(d<0)
            {
                d=-d;
            }
            // we have to perform the same for the left and right partso using the r
            //recurssion
            return isBalanced(root.left)&& isBalanced(root.right);
        }
    }
}
