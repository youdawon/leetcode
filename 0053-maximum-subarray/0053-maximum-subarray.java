class Solution {
    public int maxSubArray(int[] nums) {
        int prevSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            prevSum = Math.max(prevSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, prevSum);

            if(prevSum < 0){
                prevSum = 0;
            }
        }

        return maxSum;        
    }
}