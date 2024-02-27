class Solution {
    public void moveZeroes(int[] nums) {
        
    int in = 0;
        int n = nums.length;
        int i = 0;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                continue;
            }
            nums[in] = nums[i];
            in++;
        }
        for(int j=n-1;j>=in;j--){
            nums[j]=0;
        }
    }    
}