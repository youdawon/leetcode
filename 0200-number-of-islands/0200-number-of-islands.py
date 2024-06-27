class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        m, n = len(grid), len(grid[0])
        count = 0

        def changeLandToWater(r, c):

            if r < 0 or c < 0 or r >= m or c >= n or grid[r][c] == "0":
                return 
            grid[r][c] = "0"
            changeLandToWater(r, c-1)
            changeLandToWater(r-1, c)
            changeLandToWater(r, c+1)
            changeLandToWater(r+1, c)

        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1":
                    count += 1
                    changeLandToWater(i, j)

        return count