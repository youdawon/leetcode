class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:

        if len(s) < len(p):
            return []

        sCount, pCount = {}, {}

        for i in range(len(p)):
            sCount[s[i]] = sCount.get(s[i], 0) + 1
            pCount[p[i]] = pCount.get(p[i], 0) + 1

        res = [0] if sCount == pCount else []

        l = 0
        for r in range(len(p), len(s)):
            sCount[s[r]] = sCount.get(s[r], 0) + 1
            sCount[s[l]] -= 1

            if sCount[s[l]] == 0:
                sCount.pop(s[l])
            l += 1

            if sCount == pCount:
                res.append(l)

            
        return res
