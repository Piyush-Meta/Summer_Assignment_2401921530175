//Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int sub = prices[0];
        int maxprofit = 0;
        for(int i = 0; i< prices.length ;i++){
          if(prices[i]<sub) sub = prices[i];
          else{
                int profit = prices[i] - sub;
                 maxprofit = Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
}
