class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int result = 0;
        int start = 0;
        int compare = 0;
        
        for(int i=0; i<s.length(); i++){
            System.out.println(start);
            if(map.containsKey(s.charAt(i)) && 
              map.get(s.charAt(i)) >= start){
                
                System.out.println("compare " + compare);
                System.out.println(" result " + result);                
                if(compare > result){
                    result = compare;                    
                }
                start = map.get(s.charAt(i)) + 1;                
                compare = i - start + 1;
                map.put(s.charAt(i), i);                
                System.out.println(" compare compare " + compare);
            } else {        
                map.put(s.charAt(i), i);
                compare += 1;
            }
        }
        
        if(compare > result){
            result = compare;                    
        }        

        return result;
        
    }
}