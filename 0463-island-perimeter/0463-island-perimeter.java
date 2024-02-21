class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int rowLength = grid.length;
        int colLength = grid[0].length;
        
        int total = 0;
        
        for(int i=0; i< rowLength; i++){
            for(int j=0; j< colLength; j++){
                if(grid[i][j] == 1){
                    total += 4;
                    
                    if(i>0 && grid[i-1][j] == 1){
                            total -= 1;
                    }
                    
                    if(i+1 < rowLength && grid[i+1][j] == 1){
                            total -= 1;
                    }                    
                    
                    if(j > 0 && grid[i][j-1] == 1){
                            total -= 1;
                    }                    
                    
                    if(j+1 < colLength && grid[i][j+1] == 1){
                            total -= 1;
                    }                                    
                }                
            }
        }        
        return total;
    }
}