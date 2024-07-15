class Solution {
    public int orangesRotting(int[][] grid) {


        //Time Complexity : O(M*N)
        //Space Complexity : O(M*N)        

        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int elapsedTime = 0;
        Queue<int[]> rotten = new LinkedList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j] == 1) fresh++;
                if (grid[i][j] == 2) rotten.offer(new int[]{i, j});
            }
        }        

        while (!rotten.isEmpty() && fresh > 0){
            elapsedTime++;
            int size = rotten.size();
            for(int c=0; c < size; c++){
                int[] cell = rotten.poll();
                for (int[] direction : directions){
                    int row = cell[0] + direction[0];
                    int col = cell[1] + direction[1];
                    
                    if(row < 0 || col < 0 || row >=m || col >=n || grid[row][col] != 1)
                        continue;
                    grid[row][col] = 2;
                    rotten.offer(new int[]{row, col});
                    fresh--;
                }
            }
        }

        return fresh == 0 ? elapsedTime : -1;
    }
}