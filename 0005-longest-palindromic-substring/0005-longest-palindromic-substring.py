class Solution:
    def longestPalindrome(self, s: str) -> str:

        sLength = len(s)
        res = ""
        
        for i in range(sLength):
            
            left, right = i, i
            while left >= 0 and right < sLength and s[left] == s[right]:
                if len(res) < right - left + 1:
                    res = s[left:right+1]
                left -= 1
                right += 1 

            left, right = i, i+1
            while left >= 0 and right < sLength and s[left] == s[right]:
                if len(res) < right - left + 1:
                    res = s[left:right+1]
                left -= 1
                right += 1

        return res 
