class Solution {
    public int search(int[] nums, int target) {
        
        int centre = nums.length / 2;

        int start = 0;
        int end = 0;
        
        if(target < nums[centre]){
            start = 0;
            end = centre;
        } else {
            start = centre;
            end = nums.length;
        }
        
        for(int i=start; i<end; i++){
            
            if(target == nums[i])
                return i;
        }
        
        return -1;
    }
}