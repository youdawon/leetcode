class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(s) == 0 or len(t) == 0:
            return ""

        letterCount = collections.defaultdict(int)
        res = ""
        needCount = len(t)

        for c in t:
            letterCount[c] = letterCount.get(c, 0) + 1
        
        left = 0
        for right in range(len(s)):
            if letterCount[s[right]] > 0:
                needCount -= 1

            letterCount[s[right]] -= 1

            while needCount == 0:
                if not res or len(res) > len(s[left:right+1]):
                    res = s[left:right+1]
                
                letterCount[s[left]] += 1

                if letterCount[s[left]] > 0:
                    needCount += 1

                left += 1
        
        return res