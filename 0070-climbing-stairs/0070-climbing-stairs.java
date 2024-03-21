class Solution {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
       
        if(n <= 1){
            if(map.containsKey(n)){
                return map.get(n);                                
            } else {
                map.put(n, 1);
                return 1;
            }
        }
        
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            map.put(n, climbStairs(n-1) + climbStairs(n-2));            
            return map.get(n);
        }
    }    
}