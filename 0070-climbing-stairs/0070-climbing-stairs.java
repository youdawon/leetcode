class Solution {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        
        if(n < 2){
            return 1;
        }
        
        int steps = 0;
        
        if(!map.containsKey(n)){
            steps = climbStairs(n-1) + climbStairs(n-2);    
            map.put(n, steps);
            return steps;
        } else {
            return map.get(n);
        }
    }
}