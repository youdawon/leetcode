class Solution:
    def rob(self, nums: List[int]) -> int:
        
        money = [0]*(len(nums)+2)

        for i in range(len(nums)):
            money[i+1] = max(money[i], money[i-1] + nums[i])

        return max(money[-1], money[-2])