class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        res, maxCount, maxLength = 0, -inf, -inf
        arr = [0]*26

        left = 0
        for right in range(len(s)):
            arr[ord(s[right])-ord('A')] += 1

            maxCount = max(maxCount, arr[ord(s[right])-ord('A')])

            while right-left-maxCount+1 > k:
                arr[ord(s[left])-ord('A')] -= 1
                left += 1        

            print(right)
            print(left)

            maxLength = max(maxLength, right-left+1)
            
        return maxLength