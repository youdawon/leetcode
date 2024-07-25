class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        left = 0
        right = len(nums)-1
        numMap = collections.defaultdict(int)

        for i in range(len(nums)):
            remainder = target - nums[i]
            if remainder in numMap:
                return [i, numMap[remainder]]
            numMap[nums[i]] = i