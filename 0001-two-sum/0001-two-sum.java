class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        int i=0;
        int j=1;
                
        while(i < nums.length){            
            if(nums[i] + nums[j] == target){
                return new int[] {i, j};
            }     
            
            if(j == nums.length-1){
                i = i+1;
                j = i+1;
            } else {
                j++;
            }
            
        }        

        return new int[]{};        
    }
}