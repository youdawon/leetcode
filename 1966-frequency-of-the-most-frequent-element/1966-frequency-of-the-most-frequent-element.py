class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        
        res = 1
        left = 0
        currSum = 0

        nums.sort()

        for right in range(len(nums)):
            currSum += nums[right]
            while currSum + k < nums[right] * (right-left+1):
                currSum -= nums[left] 
                left += 1
            res = max(res, right-left+1)

        return res