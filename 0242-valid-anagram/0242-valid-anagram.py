class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        letter_map = {}

        for c in s:
            letter_map[c] = letter_map.get(c, 0) + 1
        
        for c in t:
            if c not in letter_map:
                return False

            letter_map[c] -= 1

            if letter_map[c] == 0:
                del letter_map[c]

        return True