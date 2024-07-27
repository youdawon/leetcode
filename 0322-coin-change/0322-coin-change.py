class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        # Time Complexity : O(N*K)
        #Space Complexity : O(N)
        
        dp = [inf]*(amount+1) #O(N)
        dp[0] = 0 #O(1)

        for i in range(1, amount+1): #O(N)
            for coin in coins: #O(K)
                if i < coin:
                    continue
                dp[i] = min(dp[i], dp[i-coin]+1)
        
        return dp[amount] if dp[amount] != inf else -1