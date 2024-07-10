class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(s) < len(t):
            return ""

        res = ""
        letter_map = collections.defaultdict(int)
        needCount = len(t)

        for c in t:
            letter_map[c] = letter_map.get(c, 0) + 1

        left = 0
        for right in range(len(s)):
            if letter_map[s[right]] > 0:
                needCount -= 1

            letter_map[s[right]] -= 1

            while needCount == 0:
                if not res or len(res) > right-left+1:
                    res = s[left:right+1]

                letter_map[s[left]] += 1                

                if letter_map[s[left]] > 0:
                    needCount += 1
                    
                left += 1
        
        return res