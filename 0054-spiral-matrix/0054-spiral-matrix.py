class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        res = []

        m, n = len(matrix), len(matrix[0])

        row_begin, col_begin = 0, 0
        row_end, col_end = len(matrix) - 1, len(matrix[0]) - 1

        while row_begin <= row_end and col_begin <= col_end:
            for c in range(col_begin, col_end + 1):
                res.append(matrix[row_begin][c])
            row_begin += 1
            for r in range(row_begin, row_end + 1):
                res.append(matrix[r][col_end])                
            col_end -= 1
            for c in range(col_end, col_begin-1, -1):
                res.append(matrix[row_end][c])
            row_end -= 1
            for r in range(row_end, row_begin-1, -1):
                res.append(matrix[r][col_begin])                
            col_begin += 1\
            
        return res[:m*n]
