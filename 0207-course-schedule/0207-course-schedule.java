class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(prerequisites.length == 0)
            return true;
        
        Map<Integer, List<Integer>> topoMap = new HashMap<Integer, List<Integer>>();        
        
        //init map
        for(int i=0; i<numCourses; i++){
            topoMap.put(i, new ArrayList<Integer>());
        }
         
        //setting map
        for(int[] prerequisity : prerequisites){
            int preCourse = prerequisity[1];
            int postCourse = prerequisity[0];            
            
            topoMap.get(preCourse).add(postCourse);
        }
        
        int[] visited = new int[numCourses];

        for(int key : topoMap.keySet()){
            if(iscyclic(topoMap, visited, key))
                return false;
            // visited.remove(key);
        }

        return true;
    }
    
    public boolean iscyclic(Map<Integer, List<Integer>> topoMap, int[] visited, int key){

        if(visited[key] == 2)
            return true;

        visited[key] = 2;
        for(int child : topoMap.get(key)){
            System.out.println("child " + child);
            if(visited[child] != 1){
                if(iscyclic(topoMap, visited, child)){
                    return true;
                }            
            }
        }

        visited[key] = 1;
        return false;
    }
}