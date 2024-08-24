class Solution {
    public boolean canJump(int[] nums) {

        int remainder = 0;
        
        for(int num : nums){
            if(remainder < 0){
                return false;
            }
            remainder = Math.max(remainder, num);
            remainder--;
        }

        return true;
    }
}