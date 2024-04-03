class Solution {
    public int[][] kClosest(int[][] points, int k) {
                
        int[] distance = new int[points.length];
        
        PriorityQueue<Pair<Integer, int[]>> pQueue = new PriorityQueue<>(Comparator.comparing(Pair::getKey));        
        
        for(int i=0; i<points.length; i++){            
            distance[i] = points[i][0]*points[i][0] + points[i][1] *points[i][1];
            pQueue.add(new Pair<>(distance[i], points[i]));
            

            
        }
        
        int[][] result = new int[k][2];
        
        for(int i=0; i<result.length; i++){
            Pair<Integer, int[]> pair = pQueue.poll();
            result[i] = pair.getValue();
        }
        
        return result;
    }
}