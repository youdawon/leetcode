class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int compareColor = image[sr][sc];
        
        return fill(image, sr, sc, color, compareColor);        
    }
    
    public int[][] fill(int[][] image, int sr, int sc, int color, int compareColor) {
               
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return image;
        
        if(image[sr][sc] == compareColor && image[sr][sc] != color){
            image[sr][sc] = color;        
            image = fill(image, sr-1, sc, color, compareColor);
            image = fill(image, sr+1, sc, color, compareColor);                       
            image = fill(image, sr, sc-1, color, compareColor);
            image = fill(image, sr, sc+1, color, compareColor);            
        }
        
        return image;
    }
}