class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 1;
        int right = numbers.length;
    
        while(left < right){
            
            if(numbers[left-1] + numbers[right-1] == target){
                return new int[]{left, right};                
            } else if (numbers[left-1] + numbers[right-1] > target){
                right--;
            } else if (numbers[left-1] + numbers[right-1] < target){
                left++;
            }            
        }    
        return new int[]{};
    }
}