class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        if not s:
            return 0
        
        arr = [-1] * 128
        start = 0
        maxLength = -inf

        for i in range(len(s)):
            if arr[ord(s[i])] >= start:
                start = arr[ord(s[i])] + 1
                
            arr[ord(s[i])] = i
            maxLength = max(maxLength, i - start + 1) 

        return maxLength