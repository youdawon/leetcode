class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(prerequisites.length == 0)
            return true;
        
        List<List<Integer>> courses = new ArrayList<List<Integer>>();
        
        //init map
        for(int i=0; i<numCourses; i++){
            courses.add(new ArrayList<Integer>());
        }
         
        //setting map
        for(int[] prerequisity : prerequisites){
            int preCourse = prerequisity[1];
            int curCourse = prerequisity[0];            
            
            courses.get(preCourse).add(curCourse);
        }
        
        int[] visited = new int[numCourses];
                
        for(int key = 0; key < courses.size(); key++){
            if(isCycling(courses, visited, key)){
                return false;
            }
        }

        return true;
    }
    
    public boolean isCycling(List<List<Integer>> courses, int[] visited, int key){
        
        if(visited[key] == 2)
            return true;
        
        visited[key] = 2;
        
        for(int child : courses.get(key)){
            
            if(visited[child] != 1){                
                if(isCycling(courses, visited, child)){
                    return true;
                }
            }
        }
       
        visited[key] = 1;

        return false;
    }
}