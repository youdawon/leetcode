class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        #Space Complexity : O(1)
        #Time Complexity : O(s+t), O(N)

        arr = [0]*26
        
        for c in s:
            arr[ord(c)-ord('a')] += 1

        for c in t:
            if arr[ord(c)-ord('a')] <= 0:
                return False
            arr[ord(c)-ord('a')] -= 1

        return True