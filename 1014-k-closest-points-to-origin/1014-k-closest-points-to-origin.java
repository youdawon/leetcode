class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((p1, p2) -> {

            int dis1 = p1[0]*p1[0] + p1[1]*p1[1];
            int dis2 = p2[0]*p2[0] + p2[1]*p2[1];           

            return dis2 - dis1;
        });
        
        for(int[] point : points){
            queue.offer(point);

            if (queue.size() > k){
                queue.poll();
            }
        }

        return queue.toArray(new int[0][0]);
    }
}