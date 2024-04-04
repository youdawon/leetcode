class Solution {
   public int[][] kClosest(int[][] points, int k) {
        
        if(k == points.length)
            return points;

        PriorityQueue<int[]> pq = new PriorityQueue<>((arr1, arr2) -> {
            int p1 = arr1[0] * arr1[0] + arr1[1] * arr1[1];
            int p2 = arr2[0] * arr2[0] + arr2[1] * arr2[1];            
            
            return p2 - p1;
        });
        
        for(int[] point : points){
            pq.offer(point);
            
            if(pq.size() > k)
                pq.poll();
        }
        
        return pq.toArray(new int[0][0]);
    }
}