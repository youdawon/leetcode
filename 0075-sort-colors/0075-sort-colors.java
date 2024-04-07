class Solution {
    public void sortColors(int[] nums) {
        
        int red = 0; //0
        int white = 0; //1
        int blue = 0; //2
        
        for(int n : nums){
            if(n == 0){
                red++;
            }else if(n == 1){
                white++;
            }else {
                blue++;
            }            
        }
        
        for(int i=0; i<nums.length; i++){
            if(red != 0){
                nums[i] = 0;
                red--;
            } else if(red == 0 && white != 0){
                nums[i] = 1;
                white--;
            } else {
                nums[i] = 2;
                blue--;
            }
        }
    }
}