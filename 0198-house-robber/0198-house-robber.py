class Solution:
    def rob(self, nums: List[int]) -> int:

        dp = [-1] * len(nums)

        def recursion(i):

            if i < 0:
                return 0
            
            if dp[i] != -1:
                return dp[i]

            dp[i] = max(recursion(i-1), recursion(i-2) + nums[i])

            return dp[i]

        n = len(nums) - 1

        return recursion(n)
