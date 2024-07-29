class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        buy = inf        
        max_profit = 0

        for i in range(len(prices)):
            if prices[i] < buy:
                buy = prices[i]
            
            max_profit = max(max_profit, prices[i]-buy)

        return max_profit

