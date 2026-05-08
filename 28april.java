//maximum depth of binary tree
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
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



//diameter of binary tree
class Solution {
    int diameter=0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int left=depth(root.left);
        int right=depth(root.right);

        diameter=Math.max(diameter,left+right);

        return 1+Math.max(left,right);
    }
}