class Solution {
    public int maxProfit(int[] prices) {
        int min_prices=Integer.MAX_VALUE;
        int  profit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_prices){
                min_prices=prices[i];
            }
            else if(prices[i]-min_prices>profit){
                profit=prices[i]-min_prices;
            }
        }
        return profit;
    }
}