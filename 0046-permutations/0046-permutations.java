class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<Integer> used = new HashSet<Integer>();
        List<Integer> current = new ArrayList<>();

        getPermutations(nums, current, used, result);

        return result;
    }

    public void getPermutations(int[] nums, List<Integer> current, Set<Integer> used, List<List<Integer>> result){

        if(nums.length == current.size()){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used.add(nums[i])){ 
                current.add(nums[i]);
                getPermutations(nums, current, used, result);
                current.remove(current.size()-1);
                used.remove(nums[i]);
            }
        }
    }
}