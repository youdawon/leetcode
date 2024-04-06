class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> {
            int sqrt1 = p1[0]*p1[0] + p1[1]*p1[1];
            int sqrt2 = p2[0]*p2[0] + p2[1]*p2[1];            
            
            return sqrt2 - sqrt1;
        });
        
        for(int[] point : points){

            pq.offer(point);
            
            if(pq.size() > k)
                pq.poll();
        }
        
        return pq.toArray(new int[0][0]);
    }
}