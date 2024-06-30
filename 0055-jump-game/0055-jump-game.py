class Solution:
    def canJump(self, nums: List[int]) -> bool:

        if len(nums) == 1:
            return True
        
        remainder = 0

        for num in nums:
            if remainder < 0:
                return False
            remainder = max(remainder, num)
            remainder -= 1

        return True