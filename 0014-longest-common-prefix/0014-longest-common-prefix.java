class Solution {
	public static String longestCommonPrefix(String[] strs) {

		int length = strs[0].length();
		String firstString = strs[0];
		String prefix = "";
        
        if(strs.length == 1){
            return strs[0];
        }

		for(int j=0; j < length; j++){
			String str = firstString.substring(0, j+1);
			for(int i=1; i < strs.length; i++) {
				if(!strs[i].startsWith(str)){
					break;
				}

				if(strs[i].startsWith(str)
					&& i == strs.length - 1){
					prefix = str;
				}
			}
		}

		return prefix;
	}
}