class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        answer = ""

        # odd
        for i in range(len(s)):
            left = i
            right = i
            while left <= right and left >= 0 and right < len(s):
                if s[left] == s[right]:
                    if len(answer) < right - left + 1:
                        answer = s[left:right+1]
                else:
                    break
                left -= 1
                right += 1

        # even
        for i in range(len(s)):
            left = i
            right = i+1
            while left < right and left >= 0 and right < len(s):
                if s[left] == s[right]:
                    if len(answer) < right - left + 1:
                        answer = s[left:right+1]
                else:
                    break
                left -= 1
                right += 1


        return answer