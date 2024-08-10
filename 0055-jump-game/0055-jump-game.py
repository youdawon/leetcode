class Solution:
    def canJump(self, nums: List[int]) -> bool:

        currJump = 0
        for num in nums:
            if currJump < 0:
                return False
            currJump = max(currJump, num)
            currJump -= 1
   
        return True
        