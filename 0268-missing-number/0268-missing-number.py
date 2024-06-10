class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        result = 0

        for counter, value in enumerate(nums):
            result ^= counter + 1
            result ^= value

        return result