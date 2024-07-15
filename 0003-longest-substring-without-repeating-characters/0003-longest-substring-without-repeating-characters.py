class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        maxLength = -inf
        arr = [-1]*128

        left = 0        
        for right in range(len(s)):
            if left <= arr[ord(s[right])]:
                left = arr[ord(s[right])] + 1

            maxLength = max(maxLength, right-left+1)                

            arr[ord(s[right])] = right
        
        return maxLength if maxLength != -inf else 0