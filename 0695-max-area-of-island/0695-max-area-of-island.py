class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        m, n = len(grid), len(grid[0])

        def traverse(i, j):

            if i < 0 or j < 0 or i >= m or j >= n or grid[i][j] == 0:
                return 0
            grid[i][j] = 0
            
            total = traverse(i-1, j) + traverse(i+1, j) + traverse(i, j-1) + traverse(i, j+1)                        

            return 1 + total 

        maxArea = 0

        for i in range(m):
            for j in range(n):
                if grid[i][j] == 1:
                    maxArea = max(maxArea, traverse(i, j))
            
        return maxArea    