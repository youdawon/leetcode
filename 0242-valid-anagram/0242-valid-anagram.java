class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] charArr = new char[26];

        for(char c : s.toCharArray()){
            charArr[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            if(charArr[c-'a'] == 0){
                return false;
            }
            charArr[c-'a']--;
        }        
        return true;
    }
}