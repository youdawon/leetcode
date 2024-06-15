class Solution:
    def longestPalindromeSubseq(self, s: str) -> int:
        
        sLength = len(s)
        dp = [ [0] * sLength for _ in range(sLength) ]

        for i in range(sLength-1, -1, -1):
            dp[i][i] = 1
            for j in range(i+1, sLength):
                if s[i] == s[j]:
                    dp[i][j] = dp[i+1][j-1] + 2
                else:
                    dp[i][j] = max(dp[i][j-1], dp[i+1][j])
        
        return dp[0][sLength-1]