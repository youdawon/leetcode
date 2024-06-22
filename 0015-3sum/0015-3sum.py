class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        res = []

        nums.sort()
        
        for i in range(len(nums)):
            left = i+1
            right = len(nums)-1

            if i > 0 and nums[i] == nums[i-1]:
                continue

            while left < right:
                if nums[i] + nums[left] + nums[right] == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    left += 1                    
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                elif nums[i] + nums[left] + nums[right] > 0:
                    right -= 1
                else:
                    left += 1        

        return res