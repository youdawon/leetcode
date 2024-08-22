class Solution {
    public int maxArea(int[] height) {
        
        int maxValue = 0;
        int curHeight = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){    
            curHeight = Math.min(height[left], height[right]);
            maxValue = Math.max(maxValue, curHeight * (right-left));

            if (height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }   

        return maxValue;
    }
}