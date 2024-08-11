class Solution:
    def rob(self, nums: List[int]) -> int:
        
        prev,curr = 0,nums[0]

        for i in range(1, len(nums)):
            temp = curr
            curr = max(curr, prev+nums[i])
            prev = temp

        return curr