//valid anagram
class Solution {
    public boolean isAnagram(String s,String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int num:count) {
            if(num!=0) {
                return false;
            }
        }
        return true;
    }
}


//intersection of two arrays
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }
}


//water and jug problem
class Solution {
    public boolean canMeasureWater(int jug1Capacity,int jug2Capacity,int targetCapacity) {
        if(targetCapacity>jug1Capacity+jug2Capacity) {
            return false;
        }
        return targetCapacity%gcd(jug1Capacity,jug2Capacity)==0;
    }
    private int gcd(int a,int b) {
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}