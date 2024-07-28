class Solution:
    def rob(self, nums: List[int]) -> int:

        dp = [-1]*len(nums)

        def recursion(n):
            
            if n < 0:
                return 0

            if dp[n] != -1:
                return dp[n]

            dp[n] = max(recursion(n-1), recursion(n-2) + nums[n])

            return dp[n]

        n = len(nums)-1

        return recursion(n)

