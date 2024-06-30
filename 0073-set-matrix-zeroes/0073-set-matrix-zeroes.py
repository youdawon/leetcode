class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m, n = len(matrix), len(matrix[0])

        zeroes_row = [False] * m
        zeroes_col = [False] * n
                
        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    zeroes_row[i] = True
                    zeroes_col[j] = True

        for i in range(m):
            for j in range(n):
                if zeroes_row[i] or zeroes_col[j]:
                    matrix[i][j] = 0