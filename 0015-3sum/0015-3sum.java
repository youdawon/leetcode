class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums); // O(nlogn)

        for(int i = 0; i < n; i++){
            int left = i+1;
            int right = n-1;

            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }

            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                } else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
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