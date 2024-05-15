package Trees.coadingninja;

public class treeuse {
    public static void main(String[] args) {
        tree<Integer> a = new tree<>(1);
        tree<Integer> b = new tree<>(2);
        tree<Integer> c = new tree<>(3);
        a.left = b;
        a.right = c;
        // simple determination of binary search tree
    }
}
