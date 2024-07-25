class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        currSum = 0
        maxSum = -inf
        
        for i in range(len(nums)):
            currSum = max(nums[i], nums[i] + currSum)

            maxSum = max(maxSum, currSum)

            if currSum < 0:
                currSum = 0


        return maxSum