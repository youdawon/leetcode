class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:

        time = 0
        directions = [[0, 1], [0, -1], [1, 0], [-1, 0]]
        m, n = len(grid), len(grid[0])
        fresh = 0

        rotten = deque()

        for i in range(m):
            for j in range(n):
                if grid[i][j] == 2:
                    rotten.append([i, j])
                if grid[i][j] == 1:
                    fresh += 1

        while rotten and fresh > 0:
            time += 1
            for _ in range(len(rotten)):
                i, j = rotten.popleft()
                for r, c in directions:
                    row, col = i + r, j + c
                    if row < 0 or col < 0 or row >= m or col >=n or grid[row][col] != 1:
                        continue
                    grid[row][col] = 2
                    rotten.append([row, col])
                    fresh -= 1

        return time if fresh == 0 else -1