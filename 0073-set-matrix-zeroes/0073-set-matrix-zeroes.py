class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row_set, col_set = set(), set()
        m, n = len(matrix), len(matrix[0])

        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    row_set.add(i)
                    col_set.add(j)
        
        for row in row_set:
            for j in range(n):
                matrix[row][j] = 0

        for col in col_set:
            for i in range(m):
                matrix[i][col] = 0
