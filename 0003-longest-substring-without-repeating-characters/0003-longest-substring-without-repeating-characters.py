class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        max_length = 0
        left = 0
        chars = {}

        for right in range(len(s)):

            while s[right] in chars and left <= chars[s[right]]:
                left += 1 
             
            max_length = max(max_length, right-left+1)
            chars[s[right]] = right

        return max_length