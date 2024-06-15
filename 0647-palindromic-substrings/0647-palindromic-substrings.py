class Solution:
    def countSubstrings(self, s: str) -> int:

        sLength = len(s)
        count = 0
        
        for i in range(sLength):

            left, right = i, i
            while left >= 0 and right < sLength and s[left] == s[right]:
                count += 1
                left -= 1
                right += 1

            left, right = i, i+1
            while left >= 0 and right < sLength and s[left] == s[right]:
                count += 1
                left -= 1
                right += 1                

        return count