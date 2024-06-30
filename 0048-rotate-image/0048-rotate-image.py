class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        ## space complexity:O(1)
        ## time complexity:O(n^2)

        m, n = len(matrix), len(matrix[0])

        for i in range(0, m//2):
            matrix[~i], matrix[i] = matrix[i], matrix[~i]

        for i in range(m):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]