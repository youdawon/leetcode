class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        if(map.size() == nums.length){
            return false;
        } else {
            return true;
        }
    }
}