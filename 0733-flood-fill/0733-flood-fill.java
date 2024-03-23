class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int compareValue = image[sr][sc];
        
        return fill(image, sr, sc, color, compareValue);        
    }
    
    public int[][] fill(int[][] image, int sr, int sc, int color, int compareValue) {
               
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return image;
        
        if(image[sr][sc] == compareValue && image[sr][sc] != color){
            image[sr][sc] = color;        
            image = fill(image, sr-1, sc, color, compareValue);
            image = fill(image, sr+1, sc, color, compareValue);                       
            image = fill(image, sr, sc-1, color, compareValue);
            image = fill(image, sr, sc+1, color, compareValue);            
        }
        
        return image;
    }
}