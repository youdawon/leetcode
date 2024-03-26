class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        sumValue=nums[0]
        maxValue=nums[0]
        
        for index in range(1, len(nums)):
            if sumValue < 0:
                sumValue = nums[index]
            else:
                sumValue += nums[index]
                                
            maxValue = max(maxValue, sumValue)
                    
        return maxValue
        