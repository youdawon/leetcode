class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 1;
        int right = numbers.length;
    
        while(numbers[left-1] + numbers[right-1] != target){         
            
            if (numbers[left-1] + numbers[right-1] > target){
                right--;
            } else {
                left++;
            }            
        }    
        return new int[]{left, right};
    }
}