class Solution:
    def maxProfit(self, prices: List[int]) -> int:
    
        maxProfit = 0
        buy = prices[0]

        for i in range(1, len(prices)):
            maxProfit = max(maxProfit, prices[i]-buy)

            if buy > prices[i]:
                buy = prices[i]
        
        return maxProfit