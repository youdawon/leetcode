class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int row_begin = 0;
        int row_end = matrix.length-1;
        int col_begin = 0;
        int col_end = matrix[0].length-1;

        List<Integer> result = new ArrayList<>();

        while(row_begin <= row_end && col_begin <= col_end){

            for(int j=col_begin; j<=col_end; j++){
                result.add(matrix[row_begin][j]);
            }
            row_begin++;

            for(int i=row_begin; i<=row_end; i++){
                result.add(matrix[i][col_end]);
            }
            col_end--;
            
            if (row_begin <= row_end) {
                for(int j=col_end; j>= col_begin; j--){
                    result.add(matrix[row_end][j]);
                }                        
                row_end--;
            }

            if (col_begin <= col_end) {
                for(int i=row_end; i>= row_begin; i--){
                    result.add(matrix[i][col_begin]);
                }                     
                col_begin++;              
            }
        }        

        return result;
    }
}