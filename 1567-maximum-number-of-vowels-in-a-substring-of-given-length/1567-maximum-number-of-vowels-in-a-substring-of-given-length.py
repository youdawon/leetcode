class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        
        res = 0
        vowelCnt = 0
        left = 0
        vowels = "aeiou"

        for right in range(len(s)):
            if s[right] in vowels:            
                vowelCnt += 1

            res = max(res, vowelCnt)           
            while right - left + 1 >= k:
                if s[left] in vowels:
                    vowelCnt -=1
                left += 1

        return res