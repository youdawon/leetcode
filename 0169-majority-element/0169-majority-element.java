class Solution {
    public int majorityElement(int[] nums) {
    
		// if(nums.length == 1)            
		// 	return nums[0];

		//linear time : O(N)
		//Space : O(1)
		
        
        int count = 0;
        int major = 0;
        
        /* Boyer Moore 알고리즘 
         major의 전체 개수가 0 으로 변경될 경우 돌아오는 값을 major로 바꾼다. */
                
        for(int num : nums){
            
            if(count == 0){
                major = num;
            }
            
            if(major == num){
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}