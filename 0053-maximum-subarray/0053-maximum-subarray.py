class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        # if len(nums) == 1:
        #     return nums[0]

        sumVal, maxVal = 0, -inf

        for num in nums:
            sumVal = num + sumVal

            maxVal = max(maxVal, sumVal)            

            if sumVal < 0:
                sumVal = 0

        return maxVal            
