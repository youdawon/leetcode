class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
                
        for(int i=0; i<nums.length; i++){
            int key = target - nums[i];
            if(map.get(key) != null &&
               map.get(key) != i){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}