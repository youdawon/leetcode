class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        for(char c : magazine.toCharArray()){
            
            if(map.get(c) != null){
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