class Solution:
    def mySqrt(self, x: int) -> int:

        left = 0
        right = x + 1

        while left < right:
            mid = left + (right-left) // 2
 
            if mid * mid > x:
                right = mid
            else:
                left = mid + 1

        return left - 1