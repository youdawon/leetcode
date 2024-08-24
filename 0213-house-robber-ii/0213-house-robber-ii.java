class Solution {

    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int n = nums.length;

        return Math.max(getMaxAmount(0, n-1, nums), getMaxAmount(1, n, nums));
    }

    private int getMaxAmount(int start, int end, int[] nums){
        int prev = 0;
        int curr = 0;
        for(int i = start; i < end; i++){
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }

        return Math.max(prev, curr); 
    }    
}