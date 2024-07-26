class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        m, n = len(board)-1, len(board[0])-1

        for row in board:
            arr = [ value for value in row if value != "." ]
            if len(set(arr)) != len(arr):
                return False

        for col in zip(*board):
            arr = [ value for value in col if value != "." ]
            if len(set(arr)) != len(arr):
                return False
               
        for i in (0, 3, 6):
            for j in (0, 3, 6):
                arr = [ board[x][y] for x in range(i, i+3) for y in range(j, j+3) if board[x][y] != "." ]
                if len(set(arr)) != len(arr):
                    return False                

        return True