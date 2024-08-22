class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;

        int left=0;
        for(int right=0; right<s.length(); right++){
            while(map.containsKey(s.charAt(right)) && left <= left){
                map.remove(s.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
            map.put(s.charAt(right), right);
        }

        return maxLength;
    }
}