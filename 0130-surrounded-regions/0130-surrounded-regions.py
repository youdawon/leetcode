class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])

        def bfs(i, j):
            if i < 0 or j < 0 or i >= m or j >= n or board[i][j] == "X":
                return

            if board[i][j] == "O":
                board[i][j] = "1"
                bfs(i-1, j)
                bfs(i+1, j)            
                bfs(i, j-1)
                bfs(i, j+1)                        

        for i in range(m):
            bfs(i, 0)
            bfs(i, n-1)

        for j in range(n):
            bfs(0, j)
            bfs(m-1, j)

        for i in range(m):
            for j in range(n):
                if board[i][j] == "O":
                    board[i][j] = "X"
                elif board[i][j] == "1":
                    board[i][j] = "O"