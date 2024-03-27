class Solution {
    public int lengthOfLongestSubstring(String s) {

        int current = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        int j=0; 
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            } 
            result = Math.max(i-j+1, result);                             
            map.put(s.charAt(i), i);
        }
        
        result = Math.max(current, result);
        
        return result;
    }
}