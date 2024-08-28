class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num : nums){
            if(!uniqueNumbers.add(num)){
                return true;
            }
        }
        return false;
    }
}