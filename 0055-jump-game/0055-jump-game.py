class Solution:
    def canJump(self, nums: List[int]) -> bool:

        ## time complexity : O(N)
        ## space Complexity : O(1)

        if len(nums) == 1:
            return True
        
        remainder = 0

        for num in nums:
            if remainder < 0:
                return False
            remainder = max(remainder, num)
            remainder -= 1

        return True