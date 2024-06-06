class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:

        dp = [-1] * len(cost)

        def recursion(n):
            if n < 0:
                return 0
            if n < 2:
                return cost[n]            
            if dp[n] != -1:
                return dp[n]

            dp[n] = cost[n] + min(recursion(n-1), recursion(n-2))

            return dp[n]

        n = len(cost)

        return min(recursion(n-1), recursion(n-2))
