package Trees;

import java.util.*;

public class diameteroftrree {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;

        }
    }

    public static int height(TreeNode root) {

        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int count = height(root.left) + height(root.right);
        if (root.left != null) {
            count = count + 1;
        }
        if (root.right != null) {
            count = count + 1;
        }
        return count;
    }
}
