class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> remainders = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remainder = target - nums[i];
            if(remainders.containsKey(remainder)){
                return new int[]{i, remainders.get(remainder)};
            }
            remainders.put(nums[i], i);
        }
        return new int[]{};
    }
}