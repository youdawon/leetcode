class Solution {

    private String s;
    private int sLength;

    public int countSubstrings(String s) {

        int count = 0;

        this.s = s;
        this.sLength = s.length();

        for(int i = 0; i < sLength; i++){
            int left = i;
            int right = i + 1;

            count += countPalindromic(left, right);
        }

        for(int i = 0 ; i < sLength; i++){
            int left = i;
            int right = i;

            count += countPalindromic(left, right);
        }        

        return count;        
    }

    private int countPalindromic(int left, int right){
        int count = 0;

        while(left >= 0 && right < sLength && s.charAt(left) == s.charAt(right)){
            if(s.charAt(left) == s.charAt(right)){
                count++;
            }
            left--;
            right++;
        }

        return count;
    }
}