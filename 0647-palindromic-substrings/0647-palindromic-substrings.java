class Solution {

    int totalCount = 0;
    String s;
    int n;

    public int countSubstrings(String s) {

        this.s = s;
        this.n = s.length();

        for(int i = 0; i < n; i++){
            getStringsCount(i, i+1);
            getStringsCount(i, i);            
        }
        
        return this.totalCount;
    }

    public void getStringsCount(int left, int right){
        
        while(left >= 0 && right < this.n && this.s.charAt(left) == this.s.charAt(right)){
            this.totalCount++;
            left--;
            right++;
        }        
    }
}