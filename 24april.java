
//binary search
class Solution {
    public int search(int[] nums,int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) {
                return mid;
            } else if(nums[mid]<target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return -1;
    }
}


//peak element
class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right) {
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[mid+1]) {
                right=mid;
            } else {
                left=mid+1;
            }
        }

        return left;
    }
}


//first bad version
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;

        while(left<right) {
            int mid=left+(right-left)/2;

            if(isBadVersion(mid)) {
                right=mid;
            } else {
                left=mid+1;
            }
        }

        return left;
    }
}