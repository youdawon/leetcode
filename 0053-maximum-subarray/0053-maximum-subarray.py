class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        maxValue = nums[0]
        arr = [0]*len(nums)
        arr[0] = nums[0]

        for i in range(1, len(nums)):
            if nums[i] < 0:
                arr[i] = max(nums[i]+arr[i-1], 0)
            else:
                arr[i] = max(nums[i] + arr[i-1], nums[i])

            maxValue = max(maxValue, arr[i])

        return maxValue if maxValue > 0 else max(nums)