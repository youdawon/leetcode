class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        numMap = collections.defaultdict(int)

        for i in range(len(nums)):
            if target - nums[i] in numMap:
                return [i, numMap[target-nums[i]]]
            numMap[nums[i]] = i

        return []