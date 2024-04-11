class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
                
        result = []
        prev = 0
        for i in range(len(nums)):
            prev += nums[i]
            result.append(prev)

        return result
        