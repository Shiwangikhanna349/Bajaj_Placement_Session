//kth smallest element in a bst
import java.util.*;

class Solution {
    int count=0;
    int ans=0;

    public int kthSmallest(TreeNode root,int k) {
        inorder(root,k);
        return ans;
    }

    private void inorder(TreeNode root,int k) {
        if(root==null) {
            return;
        }

        inorder(root.left,k);

        count++;

        if(count==k) {
            ans=root.val;
            return;
        }

        inorder(root.right,k);
    }
}



//convert sorted array to binary search tree
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums,int left,int right) {
        if(left>right) {
            return null;
        }

        int mid=left+(right-left)/2;

        TreeNode root=new TreeNode(nums[mid]);

        root.left=build(nums,left,mid-1);
        root.right=build(nums,mid+1,right);

        return root;
    }
}



//two sum iv input is a bst
import java.util.*;

class Solution {
    Set<Integer> set=new HashSet<>();

    public boolean findTarget(TreeNode root,int k) {
        if(root==null) {
            return false;
        }

        if(set.contains(k-root.val)) {
            return true;
        }

        set.add(root.val);

        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}