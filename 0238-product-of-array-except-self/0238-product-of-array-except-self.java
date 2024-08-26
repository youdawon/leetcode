class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];

        int prev = 1;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                prefix[i] = 1;
            } else {
                prefix[i] = prev;
            }
            prev = nums[i] * prev;
        }

        prev = 1;
        for(int i = nums.length-1; i >= 0; i--){
            if(i == nums.length-1){
                prefix[i] = 1 * prefix[i];
            } else {
                prefix[i] = prev * prefix[i];
            }
            prev = nums[i] * prev;
        }        

        return prefix;
    }
}