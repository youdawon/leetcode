class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        result = ""
        n = len(s)

        for i in range(n):
            left = i
            right = i
            while left >= 0 and right < n and s[left] == s[right]:
                if len(result) < right-left+1:
                    result = s[left:right+1]
                left -= 1
                right += 1 

        for i in range(n):
            left = i
            right = left+1
            while left >= 0 and right < n and s[left] == s[right]:
                if len(result) < right-left+1:
                    result = s[left:right+1]
                left -= 1
                right += 1 

        return result