class Solution {

    int[] candidates;
    int target;
    List<List<Integer>> result;    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        this.candidates = candidates;
        this.target = target;
        this.result = new ArrayList<>();

        backtracking(0, new ArrayList<Integer>(), 0);

        return this.result;        
    }

    public void backtracking(int index, List<Integer> current, int currSum){

        if(index == this.candidates.length || currSum > this.target){
            return;
        }

        if(currSum == this.target){
            this.result.add(new ArrayList<>(current));
            return;
        }

        current.add(this.candidates[index]);
        backtracking(index, current, currSum+this.candidates[index]);
        current.remove(current.size()-1);
        backtracking(index+1, current, currSum);        
    }
}