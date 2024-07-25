class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        currMax, currMin, resultMax = nums[0], nums[0], nums[0]        
        for i in range(1, len(nums)):
            prevMax, prevMin = currMax, currMin
            currMax = max(nums[i], nums[i]*prevMax, prevMin*nums[i])
            currMin = min(nums[i], nums[i]*prevMax, prevMin*nums[i])
            resultMax = max(resultMax, currMax)

        return resultMax