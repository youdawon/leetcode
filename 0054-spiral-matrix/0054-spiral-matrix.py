class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        res = []

        m, n = len(matrix), len(matrix[0])
        row_start, row_end = 0, m-1        
        col_start, col_end = 0, n-1

        while row_start <= row_end and col_start <= col_end:

            for j in range(col_start, col_end+1):
                res.append(matrix[row_start][j])
            row_start += 1
            
            for i in range(row_start, row_end+1):
                res.append(matrix[i][col_end])
            col_end -= 1

            for j in range(col_end, col_start-1, -1):
                res.append(matrix[row_end][j])
            row_end -= 1

            for i in range(row_end, row_start-1, -1):
                res.append(matrix[i][col_start])
            col_start += 1

        return res[:m*n]