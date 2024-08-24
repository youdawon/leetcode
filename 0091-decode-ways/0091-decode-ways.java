class Solution {
    public int numDecodings(String s) {

        if(s.charAt(0) == '0') 
            return 0;        

        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<n+1; i++){
            if(s.charAt(i-1) - '0' >= 1 && s.charAt(i-1) - '0' <= 9){
                dp[i]++;
            }
            int num = Integer.parseInt(s.substring(i-2, i));
            if(s.charAt(i-2) - '0' != 0 && num >= 10 && num <= 26){        
                dp[i] = dp[i] + dp[i-1];
            }
        }

        return dp[n];
    }
}