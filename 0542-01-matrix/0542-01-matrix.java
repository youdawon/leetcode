class Solution {
    public int[][] updateMatrix(int[][] mat) {
     
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }               
            }
        }

        int[][] direction = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!q.isEmpty()){
            
            int[] cell = q.poll();
            
            int m = cell[0];
            int n = cell[1];
            
            for(int i=0; i<4; i++){            
                int r = cell[0] + direction[i][0];
                int c = cell[1] + direction[i][1];
                
                if(r < 0 || r >= mat.length || c < 0 || c >= mat[0].length || 
                  mat[r][c] != Integer.MAX_VALUE){
                    continue;
                }
                
                mat[r][c] = mat[m][n] + 1;
                
                q.offer(new int[]{r, c});
            }
        }
            
        return mat;
    }
}