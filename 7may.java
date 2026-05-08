//invert binary tree
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) {
            return null;
        }

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}



//same tree
class Solution {
    public boolean isSameTree(TreeNode p,TreeNode q) {
        if(p==null&&q==null) {
            return true;
        }

        if(p==null||q==null||p.val!=q.val) {
            return false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}



//maximum depth of binary tree
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}