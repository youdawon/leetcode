class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        prev, maxValue = 0, -inf

        for i in range(len(nums)):
            prev = prev + nums[i]
            maxValue = max(maxValue, prev)

            if prev < 0:
                prev = 0

        return maxValue