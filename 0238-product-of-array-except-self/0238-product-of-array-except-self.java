class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int prev = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = prev;
            prev = nums[i] * prev;
        }

        prev = 1;
        for(int i = nums.length-1; i >= 0; i--){
            result[i] = prev * result[i];
            prev = nums[i] * prev;
        }        

        return result;        
    }
}