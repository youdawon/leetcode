class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        count = 0
        
        for num in nums:
            if num != target:
                count += 1
            else:
                return count
            
        return -1