class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        prefix = {}

        for i in range(len(nums)):
            if prefix.get(target - nums[i]) is not None:
                return [i, prefix.get(target - nums[i])]

            prefix[nums[i]] = i
