package Trees.coadingninja;

import java.util.Scanner;
import java.util.*;

public class inputiteratively {
    public static class tree<T> {
        public tree(T data) {
            this.data = data;
        }

        public T data; // here data can be of any type
        public tree left;
        public tree right;
    }

    public static tree<Integer> iterative() {
        Scanner s = new Scanner(System.in);
        int rootd = s.nextInt();
        Queue<tree<Integer>> q = new LinkedList<>();
        tree<Integer> roots = new tree<Integer>(rootd);
        q.add(roots);

        while (!q.isEmpty()) {
            tree<Integer> pp = q.poll();

            int leftchild = s.nextInt();
            int rightchild = s.nextInt();

            if (leftchild != -1) {
                tree<Integer> lf = new tree<Integer>(leftchild);
                q.add(lf);
                pp.left = lf;
            }

            if (rightchild != -1) {
                tree<Integer> rf = new tree<Integer>(rightchild);
                q.add(rf);
                pp.right = rf;
            }
        }
        return roots;
    }

    public static void preorder(tree<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        tree<Integer> result = iterative();
        // Do something with the 'result' tree if needed
        preorder(result);
    }
}
