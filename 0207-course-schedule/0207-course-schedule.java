class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(prerequisites.length == 0)
            return true;
        
        Map<Integer, List<Integer>> topoMap = new HashMap<Integer, List<Integer>>();     
        Map<Integer, Integer> inDegree = new HashMap<>();
        
        //init map
        for(int i=0; i<numCourses; i++){
            topoMap.put(i, new ArrayList<Integer>());
            inDegree.put(i, 0);
        }
         
        //setting map
        for(int[] prerequisity : prerequisites){
            int preCourse = prerequisity[1];
            int curCourse = prerequisity[0];            
            
            topoMap.get(preCourse).add(curCourse);
            inDegree.put(curCourse, inDegree.get(curCourse) + 1);
        }
        
        int[] visited = new int[numCourses];
                
        for(int key : topoMap.keySet()){
            if(isCycling(topoMap, visited, key)){
                return false;
            }
        }

        return true;
    }
    
    public boolean isCycling(Map<Integer, List<Integer>> topoMap, int[] visited, int key){
        
        if(visited[key] == 2)
            return true;
        
        visited[key] = 2;
        
        for(int child : topoMap.get(key)){
            
            if(visited[child] != 1){                
                if(isCycling(topoMap, visited, child)){
                    return true;
                }
            }
        }
       
        visited[key] = 1;

        return false;
    }
}