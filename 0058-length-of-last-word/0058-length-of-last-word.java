class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.replace("/\s+/g", " ").split(" ");
        
        if(arr[arr.length - 1] == " "){
            return arr[arr.length - 2].length();
        } else {
           return arr[arr.length - 1].length();            
        }
    }
}