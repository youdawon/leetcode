class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        
        numsCount = {}
        length = -inf

        left = 0
        for right in range(len(nums)):
            numsCount[nums[right]] = numsCount.get(nums[right], 0) + 1

            while numsCount[nums[right]] > k:
                numsCount[nums[left]] = numsCount.get(nums[left], 0) - 1
                if numsCount[nums[left]] == 0:
                    del numsCount[nums[left]]
                left += 1

            length = max(length, right-left+1)

        return length