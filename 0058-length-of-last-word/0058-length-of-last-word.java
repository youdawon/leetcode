class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.split(" ");
        
        int num = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].trim() != "")
                num = arr[i].trim().length();
        }
        
        return num;
    }
}