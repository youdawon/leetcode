class Solution {
    public int removeElement(int[] nums, int val) {
        
      if(nums.length == 0)
          return 0;

    int i=nums.length - 1;
    int count = nums.length;

      while(i >= 0){
          if(nums[i] == val){
            count--;
          } else {
            for(int j=0; j<i; j++){
              if(nums[j] == val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                count--;
                break;
              }              
            }            
          }
        i--;
      }
        
        return count;
    }
}