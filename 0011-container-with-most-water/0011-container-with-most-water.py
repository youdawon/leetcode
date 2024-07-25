class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        maxArea = -inf

        left = 0
        right = len(height)-1


        while left < right:
            minHeight = min(height[left], height[right])
            maxArea = max(maxArea, minHeight*(right-left))            

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return maxArea