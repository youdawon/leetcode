class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:

        #Time Complexity : O(N^2)
        #Space Complexity : O(M) + O(N)        

        word_set = set(wordDict) #O(M)
        dp = [False]*(len(s)+1) #O(N)
        dp[0] = True

        for i in range(1, len(s)+1): #O(N)
            for j in range(i): #O(N)
                if dp[j] and s[j:i] in word_set:
                    dp[i] = True
                    break

        return dp[len(s)]