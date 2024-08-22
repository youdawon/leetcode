class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    changeToLand(grid, i, j, m, n);
                    count++;
                }
            }
        }       

        return count; 
    }

    public void changeToLand(char[][] grid, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') return;

        grid[i][j] = '0';

        changeToLand(grid, i+1, j, m, n);
        changeToLand(grid, i-1, j, m, n);        
        changeToLand(grid, i, j+1, m, n);
        changeToLand(grid, i, j-1, m, n);                
    }
}