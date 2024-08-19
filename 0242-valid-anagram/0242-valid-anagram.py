class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        letters = {}

        for c in s:
            letters[c] = letters.get(c, 0) + 1

        for c in t:
            if c not in letters:
                return False
            letters[c] -= 1
            if letters[c] == 0:
                del letters[c]

        return True