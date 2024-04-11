class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        numMap = set()
        
        for num in nums:
            if num in numMap:
                return True
            else:
                numMap.add(num)
        
        
        return False
        