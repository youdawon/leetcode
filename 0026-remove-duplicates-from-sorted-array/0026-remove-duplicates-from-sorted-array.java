class Solution {
  public int removeDuplicates(int[] nums) {
          
    if(nums.length == 1){
        return 1;
    }
      
     int k = 1;
     
    for(int i=1; i<nums.length; i++){                      
      if(nums[i] != nums[i-1]){          
          nums[k] = nums[i];
          k++;                        
      }
      //   if(nums[i] < nums[i+1] ){
      //     nums[k] = nums[i+1];
      //     k++;              
      //   } else {
      //       break;
      //   }        
      // }
    }         
    return k;
  }
}