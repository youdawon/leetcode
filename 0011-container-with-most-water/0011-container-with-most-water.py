class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left = 0
        right = len(height)-1
        maxArea = -inf

        while left < right:
            curArea = (right-left) * min(height[right], height[left])
            maxArea = max(maxArea, curArea)

            if height[left] > height[right]:
                right -= 1
            else:
                left += 1
        
        return maxArea