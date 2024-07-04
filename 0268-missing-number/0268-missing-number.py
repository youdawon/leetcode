class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        nums.sort()

        if nums[0] != 0:
            return 0
        
        if nums[-1] != len(nums):
            return len(nums)

        for i in range(1, len(nums)):
            if nums[i] != i:
                return i
        
        return 0