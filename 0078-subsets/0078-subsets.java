class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        int currIndex = 0;

        getSubSets(current, currIndex, res, nums);


        return res;
    }

    public void getSubSets(List<Integer> current, int currIndex, List<List<Integer>> res, int[] nums){

        if(currIndex == nums.length){
            res.add(new ArrayList<Integer>(current));
            return;
        }

        current.add(nums[currIndex]);
        getSubSets(current, currIndex+1, res, nums);
        current.remove(current.size()-1);
        getSubSets(current, currIndex+1, res, nums);
    }
}