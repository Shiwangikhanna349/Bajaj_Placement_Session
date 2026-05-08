//second Largest gfg

class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}



// array Leaders

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxFromRight = arr[arr.length - 1];
        result.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(arr[i]);
            }
        }

        Collections.reverse(result);
        return result;
    }
}


// equilibrium Point

class Solution {
    public static int equilibriumPoint(int arr[]) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}