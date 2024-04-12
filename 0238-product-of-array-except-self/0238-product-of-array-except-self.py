class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        arr = [1]
        
        for i in range(1, len(nums)):
            arr.append(arr[i-1] * nums[i-1])
            
        prev = 1
            
        for i in reversed(range(len(nums))):
            arr[i] = arr[i] * prev            
            prev = nums[i] * prev
            
        return arr
        
            
        