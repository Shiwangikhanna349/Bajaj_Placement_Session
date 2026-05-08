//find minimum in rotated sorted array
class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right) {
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right]) {
                left=mid+1;
            } else {
                right=mid;
            }
        }

        return nums[left];
    }
}


//search in rotated sorted array
class Solution {
    public int search(int[] nums,int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;

            if(nums[mid]==target) {
                return mid;
            }
            if(nums[left]<=nums[mid]) {
                if(target>=nums[left]&&target<nums[mid]) {
                    right=mid-1;
                } else {
                    left=mid+1;
                }
            } else {
                if(target>nums[mid]&&target<=nums[right]) {
                    left=mid+1;
                } else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}



//search in 2d matrix
class Solution {
    public boolean searchMatrix(int[][] matrix,int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int left=0;
        int right=m*n-1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            int row=mid/n;
            int col=mid%n;

            if(matrix[row][col]==target) {
                return true;
            } else if(matrix[row][col]<target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        return false;
    }
}