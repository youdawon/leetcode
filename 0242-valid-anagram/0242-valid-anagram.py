class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) > len(t):
            return False

        arr = [0] * 26
        
        for c in s:
            arr[ord(c) - ord('a')] += 1

        for c in t:
            if arr[ord(c) - ord('a')] == 0:
                return False
            arr[ord(c) - ord('a')] -= 1
        
        return True