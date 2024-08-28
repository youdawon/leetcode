class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character, Integer> chars = new HashMap<>();

        for(char c : s.toCharArray()){
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!chars.containsKey(c)){
                return false;
            }
            chars.put(c, chars.get(c)-1);
            if(chars.get(c) == 0){
                chars.remove(c);
            }
        }        
        return true;
    }
}