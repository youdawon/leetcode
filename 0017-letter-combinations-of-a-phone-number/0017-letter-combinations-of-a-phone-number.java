class Solution {

    static final String[] letterArr = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<String>();         

        if (digits.length() == 0) return res;

        dfs(res, "", 0, digits);

        return res;
    }

    public void dfs(List<String> res, String current, int index, String digits){

        if(index == digits.length()){
            res.add(current);
            return;
        }

        String currStr = letterArr[digits.charAt(index)-'1'];

        for(int i=0; i<currStr.length(); i++){
            dfs(res, current + currStr.charAt(i), index+1, digits);
        }
    }
}