class Solution {
    public String longestPalindrome(String s) {

        String maxString = "";

        for(int i=0; i<s.length(); i++){
            int left = i;
            int right = left+1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(maxString.length() < right-left+1){
                    maxString = s.substring(left, right+1);
                }
                left--;
                right++;
            }
        }

        for(int i=0; i<s.length(); i++){
            int left = i;
            int right = left;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(maxString.length() < right-left+1){
                    maxString = s.substring(left, right+1);
                }
                left--;
                right++;
            }
        }        

        return maxString;
    }
}

