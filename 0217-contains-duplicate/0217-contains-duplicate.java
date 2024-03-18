class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){            
            if(!set.add(nums[i]))
                return true;
        }
        
        return false;
    }
}