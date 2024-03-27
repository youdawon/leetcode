class Solution {
    public int lengthOfLongestSubstring(String s) {

        int current = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        int i=0; 
        
        while(i < s.length()){
            if(map.get(s.charAt(i)) != null){
                result = Math.max(current, result);     
                i = map.get(s.charAt(i)) + 1;
                map.clear();
                map.put(s.charAt(i), i);
                current = 1;
            } else {
                map.put(s.charAt(i), i);                
                current += 1;
            }
            i++;
        }
        
        result = Math.max(current, result);
        
        return result;
    }
}