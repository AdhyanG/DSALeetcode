class Solution {
    public int maxProfit(int[] prices) {
        int min_val =Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min_val=Math.min(min_val,prices[i]);
            profit=Math.max(profit,prices[i]-min_val);
            
        }
        return profit;
    }
}