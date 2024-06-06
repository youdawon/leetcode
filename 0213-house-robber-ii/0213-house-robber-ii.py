class Solution:
    def rob(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]

        n = len(nums)

        def recursion(nums):

            prev1 = 0
            prev2 = 0

            for num in nums:
                temp = prev1
                prev1 = max(num + prev2, prev1)
                prev2 = temp

            return max(prev1, prev2)
        
        return max(recursion(nums[:-1]), recursion(nums[1:]))

        