class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int start = 0;
        int result = Integer.MAX_VALUE;
        int count=0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            count++;    
            while(sum >= target){
                result = Math.min(result, count);                
                count--;                                
                sum = sum - nums[start]; 
                start++;
            }                        
        }                
        
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}