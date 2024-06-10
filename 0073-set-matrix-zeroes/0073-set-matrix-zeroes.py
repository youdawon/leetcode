class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        n = len(matrix[0])

        row = set()
        col = set()

        for i in range(m):
            for j in range(n):
                if not matrix[i][j]:
                    row.add(i)
                    col.add(j)

        for i in row:
            for j in range(n):
                matrix[i][j] = 0

        for i in col:
            for j in range(m):
                matrix[j][i] = 0