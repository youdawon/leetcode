class Solution:
    def climbStairs(self, n: int) -> int:

        dp = [ 0 for _ in range(n+1) ]

        for i in range(n+1):
            if i <= 2:
                dp[i] = i
            else:
                dp[i] = dp[i-1] + dp[i-2]

        return dp[n]