class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        
        curSum = 0
        minLength = inf
        curLength = 0
        start = 0
        
        for i in range(len(nums)):
            curSum += nums[i]
            curLength += 1

            while curSum >= target:
                minLength = min(curLength, minLength)     
                curSum = curSum - nums[start]          
                curLength -= 1
                start += 1
            
        return 0 if minLength == inf else minLength