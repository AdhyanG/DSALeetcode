class Solution {
    public int maxProfit(int[] prices) {
        int num=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            num=Math.min(num,prices[i]);
            profit=Math.max(profit,prices[i]-num);
        }
        return profit;
    }
}