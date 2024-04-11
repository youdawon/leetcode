class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        result = []
        prev = 0
        
        for num in nums:
            prev += num
            result.append(prev)            
            
        return result
        