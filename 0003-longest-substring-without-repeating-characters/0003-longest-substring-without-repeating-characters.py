class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        if not s:
            return 0

        maxLength = -inf
        arr = [-1] * 128
        
        left = 0
        for right in range(len(s)):
            while arr[ord(s[right])] >= left:
                left = left + 1

            maxLength = max(maxLength, right-left+1)

            arr[ord(s[right])] = right

        return maxLength