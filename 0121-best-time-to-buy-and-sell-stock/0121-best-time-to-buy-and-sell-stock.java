class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minm=prices[0];
        for(int j=1; j< prices.length; j++){
            int cost=prices[j]-minm;
            profit=Math.max(profit,cost);
            minm=Math.min(minm,prices[j]);
            
          
        }
        return profit;
        
    }
}