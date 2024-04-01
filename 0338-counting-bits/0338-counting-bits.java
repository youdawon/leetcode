class Solution {
    public int[] countBits(int n) {

        int[] result = new int[n+1];
        // result[0] = 0;        
 
        // if(n == 0)
        //     return result;
        
       for(int i=0; i<=n; i++){
           int remainder = i % 2;
           int divided = i / 2;
           
           result[i] = result[divided] + remainder;
       }        
        
        return result;
    }
}