class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String last = s.substring(s.lastIndexOf(' ')+1);
        int n = last.length();
        return n;
    }
}