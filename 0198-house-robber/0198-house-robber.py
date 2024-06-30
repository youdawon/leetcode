class Solution:
    def rob(self, nums: List[int]) -> int:

        ## time complexity : O(n)
        ## space complexity : O(n)

        if len(nums) == 1:
            return nums[0]

        arr = [-1]*(len(nums)+1)
        arr[0] = 0

        for i in range(len(nums)):
            if i < 2:
                arr[i+1] = max(nums[i], arr[i])
            else:
                arr[i+1] = max(nums[i] + arr[i-1], arr[i])

        return max(arr[-1], arr[-2])