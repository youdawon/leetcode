class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        
//         if(nums.length == 1)
//             return false;
            
//         Set<Integer> set = new HashSet<>();

//         for(int num : nums){
//             if(!set.add(num))
//                 return true;
//         }

        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        
        return false;
    }
}