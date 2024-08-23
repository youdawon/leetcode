class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        int[] visited = new int[numCourses];
        Arrays.fill(visited, -1);
        
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<prerequisites.length; i++){
            int preCourse = prerequisites[i][1];
            int postCourse = prerequisites[i][0];            
            graph.get(preCourse).add(postCourse);
        }

        for(int num=0; num<numCourses; num++){
            if(!dfs(graph, visited, num)){
                return false;
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> graph, int[] visited, int num){

        if(visited[num] == 1)
            return true;

        if(visited[num] == 0)
            return false;

        visited[num] = 0;

        for(int i=0; i<graph.get(num).size(); i++){
            int neighbor = graph.get(num).get(i);
            if(!dfs(graph, visited, neighbor)) return false;
        }

        visited[num] = 1;        

        return true;
    }
}