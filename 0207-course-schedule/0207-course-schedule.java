class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] preq : prerequisites){
            graph.get(preq[1]).add(preq[0]);
            indegree[preq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        int availableCount = 0;

        while(!queue.isEmpty()){
            int currNum = queue.poll();
            availableCount++;

            for(int neighbor : graph.get(currNum)){
                indegree[neighbor]--;

                if(indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }

        }

        return availableCount == numCourses;
    }
}