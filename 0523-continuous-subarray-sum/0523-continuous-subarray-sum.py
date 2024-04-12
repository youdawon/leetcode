class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        
        remainders = {0:-1}
        currSum = 0
               
        for i in range(len(nums)):
            currSum += nums[i]
            
            remainder = currSum % k
            
            if remainder not in remainders:
                remainders[remainder] = i
            elif i - remainders[remainder] > 1:
                return True
                    
        return False
            
        