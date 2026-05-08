//best time to buy and sell stock
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++) {
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }

        return profit;
    }
}



//equilibrium point
class Solution {
    public static int equilibriumPoint(int arr[]) {
        int total=0;

        for(int num:arr) {
            total+=num;
        }

        int left=0;

        for(int i=0;i<arr.length;i++) {
            total-=arr[i];

            if(left==total) {
                return i;
            }

            left+=arr[i];
        }

        return -1;
    }
}



//find centre of star graph
class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]) {
            return edges[0][0];
        }

        return edges[0][1];
    }
}