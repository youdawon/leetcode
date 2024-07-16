class Solution {

    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        this.candidates = candidates;
        this.target = target;

        List<List<Integer>> result = new ArrayList<List<Integer>>();        
        List<Integer> current = new ArrayList<>();

        getSumList(0, 0, current, result);
            
        return result;
    }


    public void getSumList(int currSum, int currIndex, List<Integer> current, List<List<Integer>> result){

        if (currSum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        
        if (currSum > target) return;

        for (int i=currIndex; i<this.candidates.length; i++){
            current.add(this.candidates[i]);
            getSumList(currSum+this.candidates[i], i, current, result);
            current.remove(current.size()-1);
        }

    }
}