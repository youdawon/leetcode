class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<Integer>();

        if(p.length() > s.length()) return res;

        int arr[] = new int[26];      

        for(char c :  p.toCharArray()){
            arr[c - 'a']++;
        }

        int left = 0;
        int count = p.length(); 

        for(int right=0; right<s.length(); right++){
            if(arr[s.charAt(right) - 'a'] > 0){
                count--;
            } 

            arr[s.charAt(right) - 'a']--;

            if(count == 0) res.add(left);

            if(right-left+1 == p.length()){
                if(arr[s.charAt(left) - 'a'] >= 0) count++;

                arr[s.charAt(left) - 'a']++;

                left++;
            }
        }

        return res;
    }
}