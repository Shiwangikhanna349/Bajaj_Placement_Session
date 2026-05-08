//valid palindrome 
class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right) {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


//container with most water
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;

        while(left<right) {
            int area=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,area);

            if(height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}


//sort colours
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}