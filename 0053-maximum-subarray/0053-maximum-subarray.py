class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
 
        maxSum = -inf
        currSum = 0
            
        for i in range(len(nums)):
            currSum = currSum + nums[i];

            if currSum < 0 :
                if nums[i] > maxSum:
                    maxSum = nums[i] 
                currSum = 0;
            else: 
                if currSum > maxSum: 
                    maxSum = currSum

        return maxSum
