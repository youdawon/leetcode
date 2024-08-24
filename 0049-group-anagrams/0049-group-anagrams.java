import java.util.Iterator;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hashmap = new HashMap<>();

        for(String str : strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String sortedValue = new String(cArr); 
            if(!hashmap.containsKey(sortedValue)){
                hashmap.put(sortedValue, new ArrayList<>());
            }
            hashmap.get(sortedValue).add(str);
        }

        return new ArrayList<>(hashmap.values());
    }
}