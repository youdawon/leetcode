class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        int n = s.length();
        boolean[] isExist = new boolean[n+1];
        isExist[0] = true;

        for(int i=1; i<=n; i++){
            for(String word : wordDict){
                if(word.length() <= i && isExist[i-word.length()]){
                    if(word.equals(s.substring(i-word.length(), i))){
                        isExist[i] = true;
                    }
                }
            }            
        }
        return isExist[n];
    }
}