class Solution {
    public int maxSubArray(int[] nums) {

        //Time Complexity : O(N)
        //Space Complexity : O(1)

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums){
            currSum += num;

            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxSum;
    }
}