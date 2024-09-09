class Solution {
    public boolean canJump(int[] nums) {

        int remainder = 0;

        for(int i=0; i<nums.length; i++){
            if(remainder < 0){
                return false;
            }

            if(remainder < nums[i]){
                remainder = nums[i];
            }
            remainder--;
        }

        return true;        
    }
}