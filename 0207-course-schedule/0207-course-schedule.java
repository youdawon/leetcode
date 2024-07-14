class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<ArrayList> adj = new ArrayList<ArrayList>();
        int[] indegree = new int[numCourses];

        for (int i=0; i<numCourses; i++){
            adj.add(new ArrayList<Integer>());
        }

        for (int[] pre : prerequisites){
            int i = pre[1];
            int j = pre[0];

            indegree[j]++;
            adj.get(i).add(j);
        }

        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for(int i=0; i<numCourses; i++){
            if (indegree[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()){
            int num = q.poll();
            count++;

            List<Integer> vertices = adj.get(num);
            for(int vertex : vertices){
                indegree[vertex]--;

                if (indegree[vertex] == 0) q.offer(vertex);
            }
        }

        if (numCourses == count) return true;

        return false;
    }
}