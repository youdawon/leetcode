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
        
        char[] arr = s.toCharArray();
        int result = 0;
        int i = 0;
                
        while(i < arr.length){
            int num = map.get(arr[i]);            
            if(i+1 < arr.length && num < map.get(arr[i+1])){
                result += map.get(arr[i+1]) - num;                
                i++;
            } else {
                result += num;
            }
            i++;
        }                
        return result;
    }
}