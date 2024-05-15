package Trees;

public class preinpost {
    public static class node {
        int val;
        node left;// intially null
        node right;// intially null

        node(int val) {
            this.val = val;
        }
    }

    /*
     * public static void pip(int n) {
     * if (n == 0) {
     * return;
     * }
     * System.out.println("pre " + n);
     * pip(n - 1);
     * System.out.println("in " + n);
     * pip(n - 1);
     * System.out.println("post " + n);
     * }
     */
    public static void preordertraversals(node root) {// root left right
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preordertraversals(root.left);
        preordertraversals(root.right);

    }

    public static void inordertravel(node root) {// left root right
        if (root == null) {
            return;
        }
        int arr[]=new int[]
        inordertravel(root.left);
        
        inordertravel(root.right);

    }

    public static void postordertravel(node root) {// left right root
        if (root == null) {
            return;
        }
        postordertravel(root.left);
        postordertravel(root.right);
        System.out.println(root.val);

    }

    public static void main(String[] args) {

        node root = new node(1);
        /*
         * without the use of the constructor
         * 
         * root.val = 6;
         * System.out.println(root.val);
         */

        node a = new node(2);
        node b = new node(3);
        root.left = a;
        root.right = b;
        node c = new node(4);
        node d = new node(5);
        node e = new node(6);
        node f = new node(7);
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        preordertraversals(root);
        System.out.println();
        postordertravel(root);
        System.out.println();
        inordertravel(root);
        // pip(3);
    }

}
