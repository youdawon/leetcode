class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0;
        int j=0;
        
        while(j < nums.length){
            if(nums[j] != 0 && nums[i] == 0){
                nums[i] = nums[j];
                nums[j] = 0;
            }
            
            if(nums[i] != 0){
                i++;
            }
            
            j++;
        }
    }    
}