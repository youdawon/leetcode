class Solution {
    
    public int climbStairs(int n) {
        
        int[] arr = new int[n];
        
        if(arr[n-1] != 0)
            return arr[n-1];
        
        if(n == 1)
            return 1;
        
        arr[0] = 1;
        arr[1] = 2;
                
        for(int i=2; i<n; i++){            
            arr[i] = arr[i-1] + arr[i-2]; 
        }        
        
        return arr[n-1];
    }
}