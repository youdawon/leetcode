class Solution {
    
    /**
    * Boyer Moore's majority voting algorithm
    **/    
    public int majorityElement(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int count = 0;
        int major = 0;
        
        for(int num : nums){
            
            if(count == 0)
                major = num;
            
            if(major == num){
                count++;
            } else {
                count--;
            }
        }        
        
        return major;
    }
}