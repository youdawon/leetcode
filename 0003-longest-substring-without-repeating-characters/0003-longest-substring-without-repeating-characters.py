class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        #Time Complexity : O(N)
        #Space Complexity : O(N)

        if not s:
            return 0

        arr = [-1]*128
        left = 0
        answer = -inf

        for right in range(len(s)):
            if arr[ord(s[right])] >= left:
                left = arr[ord(s[right])] + 1

            arr[ord(s[right])] = right
            answer = max(answer, right-left+1)

        return answer