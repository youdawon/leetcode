class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<ArrayList<Integer>> courses = new ArrayList<ArrayList<Integer>>();
        int[] indegree = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            courses.add(new ArrayList<Integer>());                        
        }

        for(int[] pre : prerequisites){            
            int preCourse = pre[1];
            int curCourse = pre[0];

            courses.get(preCourse).add(curCourse);            
            indegree[curCourse]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0)
                q.offer(i);
        }
        
        while(!q.isEmpty()){        
            int num = q.poll();                                   
            order.add(num);
            
            List<Integer> children = courses.get(num);
            
            for(int child : children){
                indegree[child]--;
                
                if(indegree[child] == 0)
                    q.add(child);
            }
        }
        
        if(numCourses != order.size())
            return false;
        
        return true;
    }
}