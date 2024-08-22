class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(0 < i && nums[i-1] == nums[i]) continue;

            int left = i+1;
            int right = nums.length-1;

            while (left < right){
                if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(left < right && nums[left-1] == nums[left]){
                        left++;
                    }
                }
            }
        }
        return result;
    }
}