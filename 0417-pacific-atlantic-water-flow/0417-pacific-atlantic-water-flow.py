class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        
        m, n = len(heights), len(heights[0])

        res = []

        p_land = set()
        a_land = set()

        directions=[[0, -1], [0, 1], [-1, 0], [1, 0]]

        def spread(i, j, land):
            land.add((i, j))
            for x, y in directions:
                r, c = x + i, y + j
                if r < 0 or c < 0 or r >= m or c >= n or heights[r][c] < heights[i][j] or (r, c) in land:
                    continue
                spread(r, c, land)

        for i in range(m):
            spread(i, 0, p_land)
            spread(i, n-1, a_land)            

        for j in range(n):
            spread(0, j, p_land)
            spread(m-1, j, a_land)            

        return list(p_land & a_land)