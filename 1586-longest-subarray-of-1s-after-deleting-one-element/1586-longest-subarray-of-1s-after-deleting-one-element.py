class Solution:
    def longestSubarray(self, nums: List[int]) -> int:

        left = 0
        res = 0
        k = 1

        for right in range(len(nums)):
            if nums[right] == 0:
                k -= 1

            while k < 0:
                if nums[left] == 0:
                    k += 1
                left += 1
            res = max(res, right-left)                

        return res