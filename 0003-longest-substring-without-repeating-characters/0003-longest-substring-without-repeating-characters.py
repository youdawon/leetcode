class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        start = 0
        arr = [-1]*128
        res = 0

        for i in range(len(s)):
            if arr[ord(s[i])] >= start:
                start = arr[ord(s[i])] + 1

            arr[ord(s[i])] = i
            res = max(res, i - start+1)

        return res