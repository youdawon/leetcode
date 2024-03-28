class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 2)
            return new int[]{nums[1], nums[0]};
        
        int[] sum = new int[nums.length];        
        sum[0] = 1;
        sum[nums.length-1] = 1;
        
        for(int i=1; i<nums.length; i++){
            sum[i] = sum[i-1] * nums[i-1];
            
            System.out.println(sum[i]);
        }        
        
        int prev = 1;
        for(int j=nums.length-2; j>=0; j--){
            
            sum[j] = prev * nums[j+1] * sum[j];
            prev = nums[j+1] * prev;
            
            
        }                
        
        return sum;
    }
}