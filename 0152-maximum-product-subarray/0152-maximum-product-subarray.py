class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        #2, -3, 4, -8, 0
        max_prod, min_prod, ans = nums[0], nums[0], nums[0]
        for i in range(1, len(nums)):
            new_max_prod = max(nums[i], nums[i]*max_prod, nums[i]*min_prod)
            new_min_prod = min(nums[i], nums[i]*max_prod, nums[i]*min_prod)
            max_prod, min_prod = new_max_prod, new_min_prod
            ans = max(ans, max_prod)

        return ans