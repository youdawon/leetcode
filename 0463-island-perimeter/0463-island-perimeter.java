class Solution {
    public int islandPerimeter(int[][] grid) {
        
        if(grid.length == 1 && grid[0].length == 1)
            return 4;
        
        int land = 0;
        int neighbours = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    land++;
                    if(i+1 < grid.length && grid[i+1][j] == 1)
                        neighbours++;
                    if(j+1 < grid[0].length && grid[i][j+1] == 1)
                        neighbours++;                
                }                    
            }
        }
        
        return land*4 - neighbours * 2;
    }
}
