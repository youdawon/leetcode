class Solution:
    def rob(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]        

        n = len(nums)
        return max(self.getMaxValue(nums, 0, n-1), self.getMaxValue(nums, 1, n))

    def getMaxValue(self, nums, start, end):

        prev1, prev2 = 0,0

        for i in range(start, end):
            temp = prev1
            prev1 = max(prev1, prev2 + nums[i])
            prev2 = temp
        
        return max(prev1, prev2)