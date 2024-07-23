class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        for row in board:
            if not self.isValid(row):
                return False

        for col in zip(*board):
            if not self.isValid(col):
                return False                

        for i in (0, 3, 6):
            for j in (0, 3, 6):
                square = [board[x][y] for x in range(i, i + 3) for y in range(j, j + 3)]
                if not self.isValid(square):
                    return False                    
        return True

    def isValid(self, unit):
        unit = [ value for value in unit if value != '.' ]
        if len(set(unit)) != len(unit):
            return False

        return True
