class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        int left = 0;
        int right = nums.length-1;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            left = i+1;
            right = nums.length-1;
            
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            System.out.println(i + " " + left + " " + right);
                            
            while(left < right){
                if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(nums[left] == nums[left-1]  && left < right){
                        left++;
                    }                    
                }                    
            }
        }
        
        return list;
    }
}