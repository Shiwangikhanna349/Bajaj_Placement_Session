//koko eating bananas
class Solution {
    public int minEatingSpeed(int[] piles,int h) {
        int left=1;
        int right=0;

        for(int pile:piles) {
            right=Math.max(right,pile);
        }

        while(left<right) {
            int mid=left+(right-left)/2;

            if(canFinish(piles,h,mid)) {
                right=mid;
            } else {
                left=mid+1;
            }
        }

        return left;
    }

    private boolean canFinish(int[] piles,int h,int speed) {
        int hours=0;

        for(int pile:piles) {
            hours+=(pile+speed-1)/speed;
        }

        return hours<=h;
    }
}



//capacity to ship packages within d days
class Solution {
    public int shipWithinDays(int[] weights,int days) {
        int left=0;
        int right=0;

        for(int weight:weights) {
            left=Math.max(left,weight);
            right+=weight;
        }

        while(left<right) {
            int mid=left+(right-left)/2;

            if(canShip(weights,days,mid)) {
                right=mid;
            } else {
                left=mid+1;
            }
        }

        return left;
    }

    private boolean canShip(int[] weights,int days,int capacity) {
        int current=0;
        int needed=1;

        for(int weight:weights) {
            if(current+weight>capacity) {
                needed++;
                current=0;
            }

            current+=weight;
        }

        return needed<=days;
    }
}



//sqrt(x)
class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int ans=0;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if((long)mid*mid<=x) {
                ans=mid;
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        return ans;
    }
}