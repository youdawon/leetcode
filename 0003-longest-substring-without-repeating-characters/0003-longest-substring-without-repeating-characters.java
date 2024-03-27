class Solution {
    public int lengthOfLongestSubstring(String s) {

        int current = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        
        int i=0; 
        
        while(i < s.length()){
            if(!set.add(s.charAt(i))){
                result = Math.max(current, result);     
                int index = s.substring(0, i).lastIndexOf(s.charAt(i)); 
                s = s.substring(index+1, s.length());
                i = 0;
                set.removeAll(set);
                set.add(s.charAt(i));
                current = 1;
            } else {
                current += 1;
            }
            i++;
        }
        
        result = Math.max(current, result);
        
        return result;
    }
}