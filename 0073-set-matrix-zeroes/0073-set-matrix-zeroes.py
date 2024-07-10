class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row_set = set()
        col_set = set()
        
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    row_set.add(i)
                    col_set.add(j)

        for row in row_set:
            for j in range(len(matrix[0])):
                matrix[row][j] = 0 

        for col in col_set:
            for i in range(len(matrix)):
                matrix[i][col] = 0                 