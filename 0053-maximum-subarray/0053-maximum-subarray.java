class Solution {
    public int maxSubArray(int[] nums) {
        
        int prev = nums[0];
        int sum = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(prev + nums[i] > nums[i]){
                prev = nums[i] + prev;
            } else {
                prev = nums[i];
            }            
            max = Math.max(prev, max);

        }

        return max;
    }
}