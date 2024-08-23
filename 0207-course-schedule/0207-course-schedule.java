class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] prereq : prerequisites){
            graph.get(prereq[1]).add(prereq[0]);
            indegree[prereq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        int totCount = 0;

        while(!queue.isEmpty()){
            int currNum = queue.poll();
            totCount++;            
            for(int neighbor : graph.get(currNum)){
                indegree[neighbor]--;

                if(indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        if(numCourses != totCount){
            return false;
        }

        return true;
    }
}