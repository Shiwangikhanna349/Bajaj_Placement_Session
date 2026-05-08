//path sum
class Solution {
    public boolean hasPathSum(TreeNode root,int targetSum) {
        if(root==null) {
            return false;
        }

        if(root.left==null&&root.right==null) {
            return targetSum==root.val;
        }

        return hasPathSum(root.left,targetSum-root.val)||
               hasPathSum(root.right,targetSum-root.val);
    }
}



//binary tree right side view
import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();

        if(root==null) {
            return result;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size=queue.size();

            for(int i=0;i<size;i++) {
                TreeNode node=queue.poll();

                if(i==size-1) {
                    result.add(node.val);
                }

                if(node.left!=null) {
                    queue.offer(node.left);
                }

                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }
}



//validate binary search tree
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root,long min,long max) {
        if(root==null) {
            return true;
        }

        if(root.val<=min||root.val>=max) {
            return false;
        }

        return validate(root.left,min,root.val)&&
               validate(root.right,root.val,max);
    }
}