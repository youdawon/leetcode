class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        num_dicts = {}

        for i in range(len(nums)):
            remainder = target - nums[i]
            if remainder in num_dicts:
                return [i, num_dicts[remainder]]
            num_dicts[nums[i]] = i