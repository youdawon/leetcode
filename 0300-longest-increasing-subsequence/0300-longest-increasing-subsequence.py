class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:

        maxLength = 0
        dp = [ 1 for _ in range(len(nums)) ]
        
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j]+1)
            
        return max(dp)