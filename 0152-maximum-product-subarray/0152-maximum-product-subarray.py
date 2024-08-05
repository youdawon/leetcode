class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        # Time : O(N)
        # Space : O(1)
        
        maxValue, currMax, currMin = nums[0], nums[0], nums[0]
        for i in range(1, len(nums)):
            tempMin = min(currMin*nums[i], currMax*nums[i], nums[i])
            tempMax = max(currMin*nums[i], currMax*nums[i], nums[i])   
            currMin, currMax = tempMin, tempMax         
            maxValue = max(maxValue, currMax)

        return maxValue

