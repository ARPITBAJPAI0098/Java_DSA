package Trees;

public class changetodepth {
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        changeToDepthTreeHelper(root, 0);
    }

    private static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root, int depth) {
        if (root == null) {
            return;
        }

        root.data = depth;

        changeToDepthTreeHelper(root.left, depth + 1);
        changeToDepthTreeHelper(root.right, depth + 1);
    }

}
