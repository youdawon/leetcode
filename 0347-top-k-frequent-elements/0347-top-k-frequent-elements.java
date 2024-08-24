class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue()-a.getValue());

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            maxHeap.offer(entry);
        }

        int[] result = new int[k];

        while(k > 0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result[k-1] = entry.getKey();
            k--;
        }

        return result;
    }
}