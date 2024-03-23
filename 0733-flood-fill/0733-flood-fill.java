class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int compareColor = image[sr][sc];
        
        return fill(image, sr, sc, color, compareColor);        
    }
    
    public int[][] fill(int[][] image, int sr, int sc, int newColor, int compareColor) {
               
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
          || image[sr][sc] != compareColor || image[sr][sc] == newColor)
            return image;
        
        image[sr][sc] = newColor;        
        image = fill(image, sr-1, sc, newColor, compareColor);
        image = fill(image, sr+1, sc, newColor, compareColor);                     
        image = fill(image, sr, sc-1, newColor, compareColor);
        image = fill(image, sr, sc+1, newColor, compareColor);            
        return image;
    }
}