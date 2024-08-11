class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        buy, maxProfit = inf, 0
                
        for i in range(len(prices)):
            maxProfit = max(maxProfit, prices[i]-buy)
            if prices[i] < buy:
                buy = prices[i]
        
        return maxProfit
            