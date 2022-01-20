class Solution {
    // This Function returns minimum time required to eat all banana with speed of numberOfBananaPerHour
    public static int minimumHour(int[] a,int numberOfBananaPerHour) {
        int totalTime=0;
        for(int v : a) {
            totalTime+=(v/numberOfBananaPerHour);
            if(v%numberOfBananaPerHour!=0) {
                totalTime++;
            }
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // We See that our answer always lie between 1 to Maximum Number of banana persent in piles , so we apply Binary search on our answer to minimize time taken to eat complete banana
        int max = Integer.MIN_VALUE;
        int min = 1;
        for(int v : piles) {
            if(max<v) max=v;
        }
        int ans =max;   // maximum number of banana in pile is always a solution to eat completely
        while(min<=max) {
            int mid =min+(max-min)/2;
            int hrs = minimumHour(piles,mid);   // minimum time taken to eat completly "mid" Number of banana
            if(hrs<=h) {    // hrs is less then or equal to then we have to decrease speed of eating to increse hrs
                if(mid<ans) {   // this may be possible answer , so update our answer
                    ans=mid;
                }
                max=mid-1;
            } else {    // hrs is greater then we have to increase speed of eating to decrease hrs
                min=mid+1;
            }
        }
        return ans; // finaly return answer
    }
}