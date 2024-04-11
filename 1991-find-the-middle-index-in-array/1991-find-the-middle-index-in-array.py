class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        
        currSum = sum(nums)
        prev = 0
        
        
        for i in range(0, len(nums)):
            currSum -= nums[i]
            
            if prev == currSum:
                return i
            
            prev += nums[i]            

        return -1