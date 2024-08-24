class Solution {
    public void rotate(int[][] matrix) {
        
        int m = matrix.length-1;
        int n = matrix[0].length-1;

        for(int i = 0; i <= m / 2;  i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[m-i];
            matrix[m-i] = temp;
        }

        for(int i = 0; i <= m; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}