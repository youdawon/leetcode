class Solution:
    def findMin(self, nums: List[int]) -> int:
        
        left = 0
        right = len(nums)-1

        while left<right:
            mid = (left+right) // 2

            if nums[left] <= nums[mid]:
                if nums[mid] > nums[right]:
                    left = mid + 1
                else: 
                    right = mid
            else:
                if nums[mid] < nums[right]:
                    right = mid
                else:
                    left = mid + 1

        return nums[left]