class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        prev, curr_max = 0, -inf

        for num in nums: ## O(N)
            prev = prev + num
            curr_max = max(curr_max, prev)

            if prev < 0:
                prev = 0
        
        return curr_max
