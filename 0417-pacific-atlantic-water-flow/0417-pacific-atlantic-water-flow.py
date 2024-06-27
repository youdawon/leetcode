class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        
        p_set, a_set = set(), set()
        m, n = len(heights), len(heights[0])
        
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]

        def getWaterFlow(i, j, visited):
            visited.add((i, j))
            for r, c in directions:
                row, col = i + r, j + c
                if row < 0 or col < 0 or row >= m or col >= n or heights[row][col] < heights[i][j] or ((row, col)) in visited:
                    continue
                getWaterFlow(row, col, visited)

        for i in range(m):
            getWaterFlow(i, 0, p_set)
            getWaterFlow(i, n-1, a_set)

        for j in range(n):
            getWaterFlow(0, j, p_set)
            getWaterFlow(m-1, j, a_set)


        return list(p_set & a_set)