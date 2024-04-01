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
        
        Queue<Integer> queue = new LinkedList<>();    
        List<Integer> order = new ArrayList<>();
        
        for(int course : inDegree.keySet()){
            if(inDegree.get(course) == 0)
                queue.add(course);
        }

        while(!queue.isEmpty()){
            int key = queue.poll();
            
            order.add(key);
            
            System.out.println(queue);
            
            for(int child : topoMap.get(key)){
                inDegree.put(child, inDegree.get(child) - 1);
                if(inDegree.get(child) == 0)
                    queue.add(child);
            }
        }
        
        if(order.size() != numCourses)
            return false;
        
        return true;
    }
}