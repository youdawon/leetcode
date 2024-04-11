class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
                
        if len(nums) == 1:
            return nums
        
        result = []
        prev = 0
        
        for num in nums:
            prev += num
            result.append(prev)            
            
        return result
        