class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){                
                if(target - nums[i] == nums[j] && 
                  i != j)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}