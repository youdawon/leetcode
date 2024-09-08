class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtracking(candidates, target, 0, new ArrayList<Integer>(), 0, result);

        return result;        
    }

    public void backtracking(int[] candidates, int target, int index, List<Integer> current, int currSum, List<List<Integer>> result){

        if(index == candidates.length || currSum > target){
            return;
        }

        if(currSum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(candidates[index]);
        backtracking(candidates, target, index, current, currSum+candidates[index], result);
        current.remove(current.size()-1);
        backtracking(candidates, target, index+1, current, currSum, result);        
    }
}