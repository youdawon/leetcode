class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxAmount = 0;
        int currHeight = 0;

        while(left < right){
            currHeight = Math.min(height[left], height[right]);
            maxAmount = Math.max(maxAmount, currHeight * (right-left));

            if(height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }

        return maxAmount;        
    }
}