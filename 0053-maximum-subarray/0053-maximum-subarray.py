class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        sumValue = 0
        maxValue = 0
        
        for num in nums:
            sumValue = num + sumValue

            if sumValue < 0:
                sumValue = 0
            elif sumValue > maxValue:
                maxValue = sumValue;
                    
        return maxValue if maxValue > 0 else max(nums)
        