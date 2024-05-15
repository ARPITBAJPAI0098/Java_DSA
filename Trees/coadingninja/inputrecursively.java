package Trees.coadingninja;

import java.util.Scanner;

public class inputrecursively {
    public static tree<Integer> takeinput(Scanner sc) {
        int rootdata;
        System.out.println("enter the rootdata");
        rootdata = sc.nextInt();
        if (rootdata == -1) {
            return null;
        }
        tree<Integer> root = new tree<>(rootdata);
        root.left = takeinput(sc);
        root.right = takeinput(sc);

        return root;
    }

    public static void printtree(tree<Integer> root) {
        if (root == null) {
            return;
        }
        String toprinted = "" + root.data;
        if (root.left != null) {
            toprinted += "L:" + root.left.data + ",";

        }
        if (root.right != null) {
            toprinted += "R:" + root.right.data + ",";

        }
        System.out.println(toprinted);
        printtree(root.left);
        printtree(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tree<Integer> a = takeinput(sc);
        printtree(a);
    }

}
