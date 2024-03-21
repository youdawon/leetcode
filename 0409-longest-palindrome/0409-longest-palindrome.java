class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length() == 1)
            return 1;
        
        Set<Character> set= new HashSet<>();
        
        for(char c : s.toCharArray()){
            if(!set.add(c)){
                set.remove(c);
            } else {
                set.add(c);
            }
        }
                
        return set.size() > 0 ? s.length() - set.size() + 1 : s.length() - set.size(); 
    }
}