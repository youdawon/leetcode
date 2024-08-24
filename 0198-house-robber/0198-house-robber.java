class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        int prev = 0;
        int curr = nums[0];

        for(int i=1; i<n; i++){
            int temp = curr;
            curr = Math.max(curr, prev+nums[i]);
            prev = temp;
        }

        return curr;
    }
}