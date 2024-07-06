class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        ## Time Complexity : O(N)
        ## Space Complexity : O(N)
        
        numMap = collections.defaultdict(int)

        for i in range(len(nums)):
            if target - nums[i] in numMap:
                return [i, numMap[target-nums[i]]]
            numMap[nums[i]] = i

        return []