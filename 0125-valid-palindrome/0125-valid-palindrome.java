class Solution {
    public boolean isPalindrome(String s) {
        
        char[] cArr = s.trim().toLowerCase().toCharArray();
        int left = 0;
        int right = cArr.length-1;

        if(cArr.length == 0){
            return true;
        }

        while(left <= right){
            if(!Character.isLetterOrDigit(cArr[left])){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cArr[right])){
                right--;
                continue;
            }        
            if(cArr[left] != cArr[right]){
                return false;
            }    
            left++;
            right--;
        }

        return true;
    }
}