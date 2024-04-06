class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int result = 0;
        int current = 0;
        int start = 0;
        
        while(current < s.length()){
            
            if(map.containsKey(s.charAt(current)) && map.get(s.charAt(current)) >= start){
                start = map.get(s.charAt(current)) + 1;
            }
            
            result = Math.max(result, current - start + 1);
            
            map.put(s.charAt(current), current);            
            current++;
        }

        return result;
        
    }
}