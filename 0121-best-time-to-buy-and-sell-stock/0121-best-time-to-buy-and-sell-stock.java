class Solution {
    public int maxProfit(int[] prices) {
        
        // if(prices.length == 1){
        //     return 0;
        // }
        
        int buy = Integer.MAX_VALUE;
        int profit = 0;
                
        for(int i=0; i<prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            
            if(profit < prices[i] - buy){
                profit = prices[i] - buy;                
            }
        }
        
        return profit;
    }
}