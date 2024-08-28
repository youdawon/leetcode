class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> remainders = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(remainders.containsKey(target - nums[i])){
                return new int[]{i, remainders.get(target - nums[i])};
            }
            remainders.put(nums[i], i);
        }
        return new int[]{};
    }
}