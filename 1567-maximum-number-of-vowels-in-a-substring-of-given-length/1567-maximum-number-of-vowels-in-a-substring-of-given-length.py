class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        
        res = 0
        vowelCnt = 0
        left = 0
        vowels = "aeiou"

        for right in range(len(s)):
            if s[right] in vowels:            
                vowelCnt += 1

            if right >= k and s[right-k] in vowels:
                    vowelCnt -=1

            res = max(res, vowelCnt)           

        return res