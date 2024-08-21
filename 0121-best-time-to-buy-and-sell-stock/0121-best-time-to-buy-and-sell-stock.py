class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max_profit, buy = 0, float("inf")

        for price in prices:
            max_profit = max(max_profit, price-buy)

            if price < buy:
                buy = price

        return max_profit            
