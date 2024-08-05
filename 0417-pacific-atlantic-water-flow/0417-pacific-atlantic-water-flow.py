class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        
        p_visited, a_visited = set(), set()
        m, n = len(heights), len(heights[0])
        directions = [[0, 1],[0, -1],[-1, 0],[1, 0]]

        def dfs(i, j, visited):
            visited.add((i, j))

            for r, c in directions:
                row, col = i+r, j+c
                if row < 0 or col < 0 or row >= m or col >= n or (row, col) in visited or heights[row][col] < heights[i][j]:
                    continue
                dfs(row, col, visited)

        for i in range(m):
            dfs(i, 0, p_visited)
            dfs(i, n-1, a_visited)

        for j in range(n):
            dfs(0, j, p_visited)
            dfs(m-1, j, a_visited)

        res = []

        for i in range(m):
            for j in range(n):
                if (i, j) in p_visited and (i, j) in a_visited:
                    res.append([i, j])    
        
        return res