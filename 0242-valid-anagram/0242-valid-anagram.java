class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) 
            return false;

        int[] sArr = new int[26];

        for(char c : s.toCharArray()){
            sArr[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            sArr[c - 'a']--;
        }

        for(int count : sArr){
            if(count != 0){
                return false;
            }
        }

        return true;        
    }
}