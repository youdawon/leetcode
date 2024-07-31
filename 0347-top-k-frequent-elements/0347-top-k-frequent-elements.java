class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int result[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> 
        b.getValue() - a.getValue());
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }

        while(k > 0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result[k-1] = entry.getKey();
            k -= 1;            
        }

        return result;
    }
}