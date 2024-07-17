class Solution:
    def rob(self, nums: List[int]) -> int:
        
        arr = [0]*(len(nums)+1)
        
        for i in range(0, len(nums)):
            arr[i+1] = max(arr[i], nums[i] + arr[i-1])


        return max(arr[-1], arr[-2])