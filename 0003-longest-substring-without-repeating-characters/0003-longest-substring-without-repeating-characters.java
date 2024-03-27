class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
    
        int left = 0;
        int right = 0;

        while(right < s.length()){            
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left){
                left = map.get(s.charAt(right))+1;
            } else {
                max = Math.max(max, right-left+1);                        
            }
            map.put(s.charAt(right), right);            
            right++;
        }        
        return max;
    }
}