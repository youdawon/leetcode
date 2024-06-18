class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:

        count = 0
        maxNum = -inf
        left, right = 0, 0
        res = 0

        for num in nums:
            maxNum = max(maxNum, num)

        while right < len(nums):
            if nums[right] == maxNum:
                count += 1

            while count >= k:
                if nums[left] == maxNum:
                    count -= 1
                left += 1
                res += len(nums) - right

            right += 1

        return res