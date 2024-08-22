class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;

        for(int price : prices){
            maxProfit = Math.max(maxProfit, price-buy);
            buy = Math.min(buy, price);
        }

        return maxProfit;
    }
}