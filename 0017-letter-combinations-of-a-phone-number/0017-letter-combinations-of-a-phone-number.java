class Solution {

    static final String[] letterArr = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<String>();         

        if (digits.length() == 0) return res;

        dfs(res, new StringBuilder(), 0, digits);

        return res;
    }

    public void dfs(List<String> res, StringBuilder current, int index, String digits){

        if(index == digits.length()){
            res.add(current.toString());
            return;
        }

        String currStr = letterArr[digits.charAt(index)-'1'];

        for(int i=0; i<currStr.length(); i++){
            current.append(currStr.charAt(i));
            dfs(res, current, index+1, digits);
            current.deleteCharAt(current.length()-1);
        }
    }
}