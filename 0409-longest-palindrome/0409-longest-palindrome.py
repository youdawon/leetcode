class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        letters = set()
        count = 0

        for c in s:
            if c in letters:
                letters.remove(c)
                count += 2
            else:
                letters.add(c)

        if len(letters) > 0:
            count += 1  

        return count