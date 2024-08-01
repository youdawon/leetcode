class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        res = []
        n = len(nums)
        nums.sort()

        for i in range(n):
            left = i+1
            right = n-1

            if i > 0 and nums[i-1] == nums[i]:
                continue

            while left < right:
                if nums[i] + nums[left] + nums[right] > 0:
                    right -= 1
                elif nums[i] + nums[left] + nums[right] < 0:
                    left += 1
                else:
                    res.append([nums[i], nums[left], nums[right]])
                    left += 1
                    while left < right and nums[left-1] == nums[left]:
                        left += 1
        
        return res
