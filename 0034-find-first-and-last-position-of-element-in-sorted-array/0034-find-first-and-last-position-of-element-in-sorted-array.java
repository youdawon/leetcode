class Solution {

    int target;
    int[] nums;

    public int[] searchRange(int[] nums, int target) {

        this.target = target;
        this.nums = nums;

        int left = 0;
        int right = nums.length-1;

        return new int[]{findMinIndex(left, right), findMaxIndex(left, right)};
    }

    public int findMinIndex(int left, int right){

        int minIndex = -1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(this.nums[mid] == this.target){
                minIndex = mid;
                right = mid-1;
            } else if(this.nums[mid] < this.target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return minIndex;        
    }

    public int findMaxIndex(int left, int right){

        int maxIndex = -1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(this.nums[mid] == this.target){
                maxIndex = mid;                
                left = mid+1;
            } else if(this.nums[mid] < this.target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return maxIndex;        
    }    
}