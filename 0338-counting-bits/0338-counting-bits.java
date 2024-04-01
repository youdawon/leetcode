class Solution {
    public int[] countBits(int n) {

        if(n == 0)
            return new int[]{n};
        
        int[] result = new int[n+1];
        result[0] = 0;        
        
       for(int i=1; i<=n; i++){
           int remainder = i % 2;
           int divided = i / 2;
           
           result[i] = result[divided] + remainder;
       }        
        
        return result;
    }
}