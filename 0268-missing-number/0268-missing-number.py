class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        #Time Complexity : O(N)

        value = 0
        
        for i in range(1, len(nums)+1):
            value ^= i

        for num in nums:
            value ^= num

        return value