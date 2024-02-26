class Solution {
    public boolean containsDuplicate(int[] nums) {
        

        Set<Integer> duplicates = new HashSet<>();

        for(Integer i : nums) {
            if(!duplicates.add(i)) {
                return true;
            }
        }
        return false;
        
    }
}