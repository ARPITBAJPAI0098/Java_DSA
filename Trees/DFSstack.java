import java.util.*;
public class Solution {
    // leetocde problem by using stack and inserting the data in the arraylist
    public List<Integer> inorderTraversal(TreeNode root) {
        public class TreeNode {
            int data;
            TreeNode left;
            TreeNode right;

            TreeNode(int data) {
                this.data = data;
            }
        }
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if (root == null) {
            return arr;
        }
        st.push(root);
        TreeNode temp = st.peek();
        while (st.size() > 0) {
            if (root.left != null) {
                st.push(root.left);
                root.left = null;// after pushing initialise with null
            } else {
                System.out.println(st.pop()); // it is the inorder traversal using thre stack(DFS)
                // DFS is nothing but the inorder ;postorder and the preorder traversal
                arr.add(temp.data);
                if (root.right != null) {
                    st.push(root.right);
                }
            }
        }
        return arr;
    }
}