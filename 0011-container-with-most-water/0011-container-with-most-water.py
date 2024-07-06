class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left = 0
        right = len(height)-1
        area = -inf

        while left < right:
            area = max(area, (right - left)*min(height[left], height[right]))

            if height[right] > height[left]:
                left += 1
            else:
                right -= 1
        

        return area