class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int rowMax = mat.length-1;
        int colMax = mat[0].length-1;
        int INF = rowMax + colMax;
        
        for(int i=0; i<=rowMax; i++){
            for(int j=0; j<=colMax; j++){
                if(mat[i][j] == 0)
                    continue;
                
                int left = INF;
                int top = INF;
                if(i-1 >= 0)
                    left = mat[i-1][j];
                if(j-1 >= 0)                
                    top = mat[i][j-1];                
                    
                mat[i][j] = Math.min(top, left) + 1;
                
            }
        }     
        
        for(int i=rowMax; i>=0; i--){
            for(int j=colMax; j>=0; j--){
                if(mat[i][j] == 0)
                    continue;
                
                int right = INF;
                int bottom = INF;
                if(i+1 <= rowMax)
                    right = mat[i + 1][j];
                if(j+1 <= colMax)                
                    bottom = mat[i][j+1];                
                    
                mat[i][j] = Math.min(mat[i][j], Math.min(right,bottom) + 1);                
            }
        }     
        
        
        return mat;
    }
}