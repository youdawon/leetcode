class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){            
                return new int[]{i, map.get(target-nums[i])};
            }            
            map.put(nums[i], map.getOrDefault(nums[i], 0) + i);
        }
        
        return new int[]{};
    }
}