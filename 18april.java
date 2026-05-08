//range sum query immutable
class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}


//subarray sum equals k
import java.util.*;

class Solution {
    public int subarraySum(int[] nums,int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums) {
            sum+=num;

            if(map.containsKey(sum-k)) {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}


//two sum 2
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}