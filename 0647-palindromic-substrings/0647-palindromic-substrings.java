class Solution {
    public int countSubstrings(String s) {

        int count = 0;
        int sLength = s.length();

        for(int i = 0; i < sLength; i++){
            int left = i;
            int right = i + 1;

            while(left >= 0 && right < sLength && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }

        for(int i = 0 ; i < sLength; i++){
            int left = i;
            int right = i;

            while(left >= 0 && right < sLength && s.charAt(left) == s.charAt(right)){
                if(s.charAt(left) == s.charAt(right)){
                    count++;
                }
                left--;
                right++;
            }
        }        

        return count;        
    }
}