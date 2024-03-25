class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);        
        map.put('X', 10);
        map.put('L', 50);                
        map.put('C', 100);
        map.put('D', 500);        
        map.put('M', 1000);
        
        int result = 0;
        int i = 0;
                
        while(i < s.length()){
            int num = map.get(s.charAt(i));            
            if(i+1 < s.length() && num < map.get(s.charAt(i+1))){
                result += map.get(s.charAt(i+1)) - num;                
                i++;
            } else {
                result += num;
            }
            i++;
        }                
        return result;
    }
}