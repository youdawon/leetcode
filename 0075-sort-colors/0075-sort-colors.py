class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        #Time Complexity : O(N)
        #Space Complexity : O(1)
        
        left = 0
        right = len(nums)-1

        i = 0

        while i <= right:
            if nums[i] == 2:
                temp = nums[right]
                nums[right] = nums[i]
                nums[i] = temp
                right -= 1
            elif nums[i] == 0:
                temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp
                left += 1
                i += 1
            else:
                i += 1
            