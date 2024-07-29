class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> row_set = new HashSet<Integer>();
        Set<Integer> col_set = new HashSet<Integer>();        

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row_set.add(i);
                    col_set.add(j);
                }
            }
        }

        for(int num : row_set){
            for(int j=0; j<matrix[0].length; j++){
                matrix[num][j] = 0;
            }
        }

        for(int num : col_set){
            for(int i=0; i<matrix.length; i++){
                matrix[i][num] = 0;
            }
        }        
    }
}