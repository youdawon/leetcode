class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = minHeap.poll().getKey();   
        }

        return result;
    }
}