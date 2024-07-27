class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        dp = [0] + [amount + 1 for i in range(amount)]

        #Time Complexity : O(N^2)
        #Space Complexity : O(N)

        for i in range(1, amount+1):
            for coin in coins:
                if i < coin:
                    continue
                dp[i] = min(dp[i], dp[i-coin] + 1)                    

        return dp[-1] if dp[-1] != amount + 1 else -1                                                                       