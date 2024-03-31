class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers.length == 2)
            return new int[]{1, 2};
        
        int left = 1;
        int right = numbers.length;
    
        while(left < right){            
            if(numbers[left-1] + numbers[right-1] == target){
                return new int[]{left, right};                
            } else if (numbers[left-1] + numbers[right-1] > target){
                right--;
            } else {
                left++;
            }            
        }    
        return new int[]{};
    }
}