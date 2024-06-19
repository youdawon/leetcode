class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int needCount = t.length();

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int startIndex = 0;
        int minLength = Integer.MAX_VALUE;

        int left = 0;
        for (int right=0; right < s.length(); right++){
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) > 0){
                needCount -= 1;
            }

            map.put(c, map.getOrDefault(c, 0) - 1);

            while (needCount == 0){
                if (minLength > right-left+1){
                    startIndex = left;
                    minLength = right-left+1;
                }

                map.put(s.charAt(left), map.get(s.charAt(left))+1);

                if (map.get(s.charAt(left)) > 0){
                    needCount += 1;
                }

                left += 1;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(startIndex, startIndex+minLength);
    }
}