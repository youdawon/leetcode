class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        result = [] * len(nums)
        prev = 1

        for i in range(len(nums)):
            result.append(prev)
            prev = nums[i] * prev   

        prev = 1

        for i in range(len(nums)-1, -1, -1):
            result[i] = prev * result[i]
            prev = nums[i] * prev

        return result        
