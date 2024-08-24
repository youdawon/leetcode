class Solution {

    String maxString = "";
    String s;
    int n;

    public String longestPalindrome(String s) {

        this.s = s;
        this.n = s.length();

        for(int i = 0; i < n; i++){
            getMaxString(i, i+1);
        }

        for(int i = 0; i < n; i++){    
            getMaxString(i, i);
        }        

        return this.maxString;
    }
    private void getMaxString(int left, int right){
        while(left >= 0 && right < this.n && this.s.charAt(left) == this.s.charAt(right)){
            if(this.maxString.length() < right-left+1){
                this.maxString = this.s.substring(left, right+1);
            }
            left--;
            right++;
        }        
    }
}