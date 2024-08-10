class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        
        maxNum, currMaxNum, currMinNum = nums[0], nums[0], nums[0]

        for i in range(1, len(nums)):
            tempMin = currMinNum
            currMinNum = min(currMaxNum*nums[i], tempMin*nums[i], nums[i])
            currMaxNum = max(currMaxNum*nums[i], tempMin*nums[i], nums[i])
            maxNum = max(maxNum, currMaxNum)

        return maxNum