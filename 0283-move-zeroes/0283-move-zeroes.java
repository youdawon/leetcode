class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0;
        
        for(int j=0; j<nums.length; j++){
            
            if(nums[j] == 0)
                continue;
            
            nums[i] = nums[j];
            
            i++;
        }
        
        
        for(int n=nums.length-1; n>=i; n--){
            nums[n] = 0;
        }
    }    
}