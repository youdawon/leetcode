class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        buy = prices[0]
        profit = -inf 
        
        for i in range(1, len(prices)):
            
            if prices[i] - buy > profit: 
                profit = prices[i] - buy                
            
            if prices[i] < buy:
                buy = prices[i]
                
        
        return profit if profit > 0 else 0
                
                 
            
            