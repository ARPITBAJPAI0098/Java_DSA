package Trees;

public class insertinBST {
    ublic TreeNode

    insertIntoBST(TreeNode root, int val) {
        TreeNode st=new TreeNode(val);// addition of thed entire node
        if(root==null){
            return st; //of no nood is preseint then directly add
        }
        if(root.val>val){
            if(root.left==null){
            root.left=st;
            }
            else{
                insertIntoBST(root.left,val);
            }
        }
        if(root.val<val){
            if(root.right==null){
            root.right=st;
            }
            else{
                insertIntoBST(root.right,val);
            }
        }
        return root;
    }
}
/* 
public class ReplacePi {
    public static String replacePi(String s) {
        // Base case: If the string is empty or does not contain "pi", return the string as is.
        if (s == null || s.isEmpty() || !s.contains("pi")) {
            return s;
        }

        // Find the first occurrence of "pi" in the string.
        int index = s.indexOf("pi");

        if (index != -1) {
            // Replace "pi" with "3.14" and make a recursive call for the remaining part of the string.
            return s.substring(0, index) + "3.14" + replacePi(s.substring(index + 2));
        } else {
            // If there are no more occurrences of "pi", return the string as is.
            return s;
        }
    }

    public static void main(String[] args) {
        String inputString = "pipi";
        String result = replacePi(inputString);
        System.out.println(result); // Output: "3.143.14"
    }
}
*/
