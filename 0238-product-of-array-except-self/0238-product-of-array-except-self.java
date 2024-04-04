class Solution {
    public int[] productExceptSelf(int[] nums) {
                
        int[] result = new int[nums.length];        
        result[0] = 1;
        result[nums.length-1] = 1;                
        int[] temp = new int[nums.length];        
        temp[0] = 1;
        temp[nums.length-1] = 1;
            
        for(int i=1; i<nums.length; i++){
            temp[i] = temp[i-1] * nums[i-1]; 
        }

        for(int j=nums.length-2; j>= 0; j--){
            result[j] = result[j+1] * nums[j+1];
        }        
        
        for(int i=0; i<nums.length; i++){
            result[i] = temp[i] * result[i]; 
        }
                
        return result;
    }
}