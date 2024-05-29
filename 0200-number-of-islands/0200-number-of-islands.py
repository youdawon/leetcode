class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        count = 0

        def changeLandToWater(i, j):

            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] == "0":
                return
            grid[i][j] = "0"
            changeLandToWater(i-1, j)
            changeLandToWater(i+1, j)
            changeLandToWater(i, j-1)
            changeLandToWater(i, j+1)        

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    changeLandToWater(i, j)
                    count += 1



        return count