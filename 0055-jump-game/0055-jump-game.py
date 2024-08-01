class Solution:
    def canJump(self, nums: List[int]) -> bool:

        remainder = 0
        
        for num in nums:
            if remainder < 0:
                return False 
                
            if remainder < num:
                remainder = num            
            remainder -= 1

        return True
