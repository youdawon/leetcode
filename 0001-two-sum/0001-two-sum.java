class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        
        HashMap<Integer, Integer> map = new HashMap<>();
                
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], i);
            }            
            int key = target - nums[i];            
            if(map.get(key) != null &&
               map.get(key) != i){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}