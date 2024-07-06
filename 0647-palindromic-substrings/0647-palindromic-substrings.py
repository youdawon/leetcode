class Solution:
    def countSubstrings(self, s: str) -> int:
        
        count = 0

        #Odd
        for i in range(len(s)):
            left = i
            right = i
            while left<=right and left >= 0 and right < len(s):
                if s[left] == s[right]:
                    count += 1
                else:
                    break
                left -= 1
                right += 1

        #Even
        for i in range(len(s)):
            left = i
            right = i+1
            while left < right and left >= 0 and right < len(s):
                if s[left] == s[right]:
                    count += 1
                else:
                    break
                left -= 1
                right += 1                
        
        return count