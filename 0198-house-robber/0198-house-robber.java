class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);

        return recursion(dp, nums.length-1, nums);
    }

    public int recursion(int[] dp, int n, int[] nums){

        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];

        dp[n] = Math.max(recursion(dp, n-1, nums), recursion(dp, n-2, nums) + nums[n]);

        return dp[n];
    }
}