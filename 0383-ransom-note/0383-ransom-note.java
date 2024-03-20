class Solution {
    
    /**
    * Time Complexity : O(n)
    * Space Comlexity : O(n)
    **/
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length())
            return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }        
        
        for(char c : magazine.toCharArray()){          
            if(map.containsKey(c)){
                if(map.get(c) == 1){
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);                    
                }
            } 
        }
        
        if(map.size() > 0){
            return false;
        } else {
            return true;
        }
    }
}