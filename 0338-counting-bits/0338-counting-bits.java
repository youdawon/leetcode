class Solution {
    public int[] countBits(int n) {

        int[] dp = new int[n+1];
        int offset = 1;

        for(int num=1; num<=n; num++){
            if(offset * 2 == num){
                offset = offset * 2;
            }
            dp[num] = dp[num-offset]+1;
        }

        return dp;
    }
}