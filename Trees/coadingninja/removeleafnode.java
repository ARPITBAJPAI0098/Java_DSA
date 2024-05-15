package Trees.coadingninja;

public class removeleafnode {
    public static tree<Integer>removeleaf(tree<Integer>root)
    {
        if(root==null)
        {
            return null;
        }
        if(root.left==null&&root.right==null)
        {
            return null;
        }
        root.left=removeleaf(root.left);
        root.right=removeleaf(root.right);
        return root;
    }
}
