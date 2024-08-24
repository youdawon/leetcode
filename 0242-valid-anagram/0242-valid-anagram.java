class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) 
            return false;

        Map<Character, Integer> hashmap = new HashMap<>();

        for(char c : s.toCharArray()){
            hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            if(!hashmap.containsKey(c))
                return false;
            int count = hashmap.get(c)-1;
            if(count == 0){
                hashmap.remove(c);
                continue;
            }
            hashmap.put(c, count);
        }        

        return true;        
    }
}