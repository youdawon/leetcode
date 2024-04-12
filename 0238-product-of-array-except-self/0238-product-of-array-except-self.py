class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        arr = [1]
        
        for i in range(1, len(nums)):
            arr.append(arr[i-1] * nums[i-1])
            
        prev = 1
        
        lastIndex = len(nums)-1
            
        for i in range(0, len(nums)):
            arr[lastIndex-i] = arr[lastIndex-i] * prev            
            prev = nums[lastIndex-i] * prev
            
        return arr
        
            
        