class Solution {
  public int removeDuplicates(int[] nums) {
          
     int k = 1;
      
    if(nums.length == 1){
        return 1;
    }
     
    for(int i=0; i<nums.length-1; i++){                      
      if(nums[i] != nums[i+1]){
        if(nums[i] < nums[i+1] ){
          nums[k] = nums[i+1];
          k++;              
        } else {
            break;
        }        
      }
    }   
      
    return k;
  }
}