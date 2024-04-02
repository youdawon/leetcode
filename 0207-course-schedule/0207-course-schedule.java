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
        
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> order = new ArrayList<>();
        
        for(int key : topoMap.keySet()){
            if(isCycling(topoMap, set, key)){
                return false;
            }
        }

        return true;
    }
    
    public boolean isCycling(Map<Integer, List<Integer>> topoMap, Set<Integer> set, int key){
        
        if(set.contains(key)){
            return true;
        }
        
        set.add(key);
        
        for(int child : topoMap.get(key)){
            
            if(isCycling(topoMap, set, child)){
                return true;
            }
        }
        
        
        set.remove(key);
        topoMap.put(key, new ArrayList<Integer>());

        return false;
    }
}