class Solution:
    def countSubstrings(self, s: str) -> int:

        n = len(s)-1
        count = 0

        for i in range(len(s)):
            left, right = i, i
            while left >= 0 and right <= n and s[left] == s[right]:
                count += 1
                left -= 1
                right += 1

        for i in range(len(s)):
            left, right = i, i+1
            while left >= 0 and right <= n and s[left] == s[right]:
                count += 1
                left -= 1
                right += 1                

        return count