class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        maxValue, currValue = -inf, 0

        for i in range(0, len(nums)):
            currValue += nums[i]

            maxValue = max(maxValue, currValue)

            if currValue < 0:
                currValue = 0


        return maxValue


