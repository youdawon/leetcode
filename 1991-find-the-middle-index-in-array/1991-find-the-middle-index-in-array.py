class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        
        currSum = 0
        prev = 0
        
        for num in nums:
            currSum += num
        
        for i in range(0, len(nums)):
            currSum -= nums[i]
            
            if prev == currSum:
                return i
            
            prev += nums[i]            

        return -1