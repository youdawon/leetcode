class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        maxValue, minProd, maxProd = nums[0], nums[0], nums[0]

        for i in range(1, len(nums)):
            newMinProd = min(nums[i], nums[i]*minProd, nums[i]*maxProd)
            newMaxProd = max(nums[i], nums[i]*minProd, nums[i]*maxProd)
            minProd, maxProd = newMinProd, newMaxProd
            maxValue = max(maxValue, maxProd)

        return maxValue
