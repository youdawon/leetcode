class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        
        result = 0
        curSum = 0
        
        for g in gain:            
            curSum += g

            result = max(curSum, result)
                        
        return result
            