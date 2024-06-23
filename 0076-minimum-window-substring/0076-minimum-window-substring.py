class Solution:
    def minWindow(self, s: str, t: str) -> str:
        
        if len(s) < len(t):
            return ""

        minStr = ""
        needCount = len(t)
        letters = collections.Counter(t)

        left = 0
        for right in range(len(s)):
            if letters[s[right]] > 0:
                needCount -= 1

            letters[s[right]] -= 1

            while needCount == 0:
                if not minStr or len(minStr) > right-left + 1:
                    minStr = s[left:right+1]

                letters[s[left]] += 1                    
            
                if letters[s[left]] > 0:
                    needCount += 1

                left += 1

        return minStr