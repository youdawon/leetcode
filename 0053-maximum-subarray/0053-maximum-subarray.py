class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        arr = [0]*len(nums)        
        maxSum = nums[0]                
        arr[0] = maxSum

        for i in range(1, len(nums)):            
            if arr[i-1] + nums[i] >= 0:
                arr[i] = arr[i-1] + nums[i]
            else:
                arr[i] = max(nums[i], 0)

            maxSum = max(maxSum, arr[i])
            
        return maxSum
            