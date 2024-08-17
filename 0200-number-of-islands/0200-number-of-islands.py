class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        count = 0
        m, n = len(grid)-1, len(grid[0])-1

        def dfs(i, j):
            if i < 0 or j < 0 or i > m or j > n or grid[i][j] == "0":
                return 
                
            grid[i][j] = "0"

            dfs(i-1, j)
            dfs(i+1, j)
            dfs(i, j-1)
            dfs(i, j+1)

        for i in range(m+1):
            for j in range(n+1):
                if grid[i][j] == "1":
                    dfs(i, j)
                    count += 1
            

        return count