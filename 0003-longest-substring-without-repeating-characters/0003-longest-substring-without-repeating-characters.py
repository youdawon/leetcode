class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        if not s:
            return 0
        
        max_length = float("-inf")
        chars = {}

        left = 0
        for right in range(len(s)):
            while s[right] in chars and left <= chars[s[right]]:
                left += 1
            max_length = max(max_length, right-left+1)
            chars[s[right]] = right            

        return max_length