class Solution:
    def uniquePaths(self, m: int, n: int) -> int:

        res = [[0 for _ in range(n)] for _ in range(m)]

        for i in range(m):
            for j in range(n):
                if i == 0 or j == 0:
                    res[i][j] = 1
                else:
                    res[i][j] = res[i-1][j] + res[i][j-1]
        
        return res[-1][-1]