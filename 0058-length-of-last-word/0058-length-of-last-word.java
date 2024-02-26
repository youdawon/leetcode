class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.split(" ");
        
        int max = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].trim()!= "")
                max = arr[i].trim().length();
        }
        
        return max;
    }
}