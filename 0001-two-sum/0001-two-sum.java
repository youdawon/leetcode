class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){                
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j-i]+nums[j]==target){
                    return new int[]{j-i,j};
                    }
                }
            }        
        
        return null;
    }
}