class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
        while(low <= high){            
            mid = low + (high-low)/2;        
            
            System.out.println(mid);
            
            if(target == nums[mid]){
                return mid;
            } else if(target < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }         
        }
        
        return -1;
    }
}