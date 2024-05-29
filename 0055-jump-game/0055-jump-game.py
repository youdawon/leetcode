class Solution:
    def canJump(self, nums: List[int]) -> bool:

        remainder = 0

        for num in nums:
            if remainder < 0:
                return False

            if num > remainder:
                remainder = num
            remainder -= 1

        return True