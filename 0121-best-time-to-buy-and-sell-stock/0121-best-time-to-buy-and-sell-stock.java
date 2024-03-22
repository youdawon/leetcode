class Solution {
    public int maxProfit(int[] prices) {
        
        int leastPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int todaysProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < leastPrice){
                leastPrice = prices[i];
            }
        
            maxProfit = prices[i] - leastPrice;

            if(maxProfit > todaysProfit ){
                todaysProfit = maxProfit;
            }            
        }
        
        return todaysProfit;
    }
}