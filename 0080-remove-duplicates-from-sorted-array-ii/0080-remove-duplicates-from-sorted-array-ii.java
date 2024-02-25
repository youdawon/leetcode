class Solution {
  public static int removeDuplicates(int[] nums) {
  
    if(nums.length == 1){
      return 1;
    }

    int k=1; 
    int duplCount = 1;
    
    for(int i=1; i< nums.length; i++){             
      if(nums[i] == nums[i-1]){
          if(duplCount == 1){
              nums[k] = nums[i];
              k++;
              duplCount++;      
          }
      } else {
        nums[k] = nums[i];
        k++;
        duplCount = 1;
      }      
    }                  
    return k;
  }
}