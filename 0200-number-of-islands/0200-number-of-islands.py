class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        m, n = len(grid), len(grid[0])
        count = 0

        def changeWaterToTheLand(i, j):
            
            if i < 0 or j < 0 or i >= m or j >= n or grid[i][j] != "1":
                return 

            grid[i][j] = "0"
            changeWaterToTheLand(i-1, j)
            changeWaterToTheLand(i+1, j)
            changeWaterToTheLand(i, j-1)
            changeWaterToTheLand(i, j+1)                        
        
        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1":
                    count += 1
                    changeWaterToTheLand(i, j)
    
        return count