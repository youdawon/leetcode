class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        int sum = 0;
        int i=0;
        int j=0;
        
        
        while(i < nums.length){
            if(j == nums.length - 1){
                i = i+1;
                j = i+1;
            } else {
                j = j+1;
            }
            
            sum = nums[i] + nums[j];
            if(sum == target){
                return new int[] {i, j};
            }                         
        }        

        return new int[]{};        
    }
}