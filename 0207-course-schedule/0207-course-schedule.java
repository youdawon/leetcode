class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<ArrayList<Integer>> courses = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<numCourses; i++){
            courses.add(new ArrayList<Integer>());                        
        }

        for(int[] pre : prerequisites){            
            int preCourse = pre[1];
            int curCourse = pre[0];
            courses.get(preCourse).add(curCourse);            
        }
        
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(isCyclic(courses, i, visited))
                return false;
        }
            
        
        return true;
    }
    
    public boolean isCyclic(List<ArrayList<Integer>> courses, int number, int[] visited){
        if(visited[number] == 2)
            return true;
        
        visited[number] = 2;
        
        for(int child : courses.get(number)){
            if(visited[child] != 1){
                if(isCyclic(courses, child, visited))
                    return true;
            }
        }
        
        visited[number] = 1;
        
        return false;
    }
}