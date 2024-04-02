class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // if(numCourses == 1 && prerequisites.length == 0)
        //     return new int[]{0};

        List<List<Integer>> courses = new ArrayList<List<Integer>>();
        int[] inDegreeArr = new int[numCourses];
                
        for(int i=0; i<numCourses; i++){
            courses.add(new ArrayList<Integer>());   
        }
        
        for(int[] course : prerequisites){
            int preCourse = course[1];
            int curCourse = course[0];
            
            courses.get(preCourse).add(curCourse);
            
            inDegreeArr[curCourse]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int[] order = new int[numCourses];
        
        for(int i=0; i<inDegreeArr.length; i++){
            if(inDegreeArr[i] == 0)
                queue.add(i);
        }

        int i=0;
        while(!queue.isEmpty()){
            
            int q = queue.poll();
            
            order[i] = q;            
            
            for(int child : courses.get(q)){
                inDegreeArr[child]--;
                
                if(inDegreeArr[child] == 0)
                    queue.add(child);
            }
            i++;
        }
        
        if(numCourses != i)
            return new int[]{};
        
        return order;
    }
}