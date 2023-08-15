import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for(int number : arr){
            if(countMap.containsKey(number)){
                countMap.put(number, countMap.get(number)+1);
            } else {
                countMap.put(number, 1);
            }
        }

        Set<Integer> countSet = new HashSet<Integer>(countMap.keySet());
        Set<Integer> numberSet = new HashSet<Integer>(countMap.values());

        if(countSet.size() != numberSet.size()){
            return false;
        } else {
            return true;
        }
    }
}