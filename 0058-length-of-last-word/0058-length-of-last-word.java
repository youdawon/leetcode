class Solution {
    public int lengthOfLastWord(String s) {
        
        String input = s.trim();
        
        String[] arr = input.split(" ");
        
        
        return arr[arr.length-1].trim().length();
    }
}