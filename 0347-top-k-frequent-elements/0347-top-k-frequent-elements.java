class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Time Complexity : O(K log D)
        // Space Complexity : O(D)

        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){ 
            map.put(num, map.getOrDefault(num, 0) + 1); // O(logD)
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }

        
        while (k > 0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[k-1] = entry.getKey();
            k -= 1;
        }
        
        return res;
    }
}