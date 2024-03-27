class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        
        int[] arr = new int[128];
        Arrays.fill(arr, -1);
        int left = 0;
        
        for(int right=0; right<s.length(); right++){
            if(arr[s.charAt(right)] >= left){
                left = arr[s.charAt(right)] + 1;
            }                        
            arr[s.charAt(right)] = right;
            max = Math.max(right-left+1, max);
        }
        
        return max;
    }
}