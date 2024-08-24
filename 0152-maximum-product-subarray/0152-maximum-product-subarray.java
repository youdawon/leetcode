class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];

        int maxValue = nums[0];
        int minValue = nums[0];
        int currValue = nums[0];
        for(int i=1; i<n; i++){
            int tempMaxValue = maxValue;
            int tempMinValue = minValue;
            maxValue = Math.max(nums[i], Math.max(tempMaxValue*nums[i], tempMinValue*nums[i]));
            minValue = Math.min(nums[i], Math.min(tempMaxValue*nums[i], tempMinValue*nums[i]));
            currValue = Math.max(currValue, maxValue);
        }

        return currValue;
    }
}