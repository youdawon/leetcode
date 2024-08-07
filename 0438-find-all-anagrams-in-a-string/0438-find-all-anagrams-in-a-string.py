class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:

        res = []        

        if len(s) < len(p):
            return []

        sCount, pCount = {}, {}

        for i in range(len(p)):
            pCount[p[i]] = pCount.get(p[i], 0) + 1
            sCount[s[i]] = sCount.get(s[i], 0) + 1

        if pCount == sCount:
            res.append(0);

        left = 0
        for right in range(len(p), len(s)):
            sCount[s[right]] = sCount.get(s[right], 0) + 1
            sCount[s[left]] -= 1
            if sCount[s[left]] == 0:
                del sCount[s[left]]

            left += 1                

            if sCount == pCount:
                res.append(left)


        return res