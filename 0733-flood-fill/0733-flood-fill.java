class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int compareColor = image[sr][sc];
        
        fill(image, sr, sc, color, compareColor);
        
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int newColor, int compareColor) {
               
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
          || image[sr][sc] != compareColor || image[sr][sc] == newColor)
            return;
        
        image[sr][sc] = newColor;        
        fill(image, sr-1, sc, newColor, compareColor);
        fill(image, sr+1, sc, newColor, compareColor);                     
        fill(image, sr, sc-1, newColor, compareColor);
        fill(image, sr, sc+1, newColor, compareColor);            
    }
}