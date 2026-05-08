//maximum average subarray 1
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (i >= k - 1) {
                maxAvg = Math.max(maxAvg, currentSum / k);
                currentSum -= nums[i - (k - 1)];
            }
        }
        return maxAvg;
    }
}


//longest substring without repeating charactersimport java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int max=0;

        for(int right=0;right<s.length();right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }

        return max;
    }
}



//permutation in string
class Solution {
    public boolean checkInclusion(String s1,String s2) {
        if(s1.length()>s2.length()) {
            return false;
        }
        int[] count1=new int[26];
        int[] count2=new int[26];

        for(int i=0;i<s1.length();i++) {
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        if(matches(count1,count2)) {
            return true;
        }
        for(int i=s1.length();i<s2.length();i++) {
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-s1.length())-'a']--;

            if(matches(count1,count2)) {
                return true;
            }
        }
        return false;
    }
    private boolean matches(int[] a,int[] b) {
        for(int i=0;i<26;i++) {
            if(a[i]!=b[i]) {
                return false;
            }
        }
        return true;
    }
}