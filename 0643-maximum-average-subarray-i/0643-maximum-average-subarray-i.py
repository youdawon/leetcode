class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        currSum = sum(nums[:k])
        maxSum = currSum
        
        for i in range(k, len(nums)):
            
            currSum = currSum + nums[i] - nums[i-k]
            
            maxSum = max(maxSum, currSum);
            
        return maxSum / k