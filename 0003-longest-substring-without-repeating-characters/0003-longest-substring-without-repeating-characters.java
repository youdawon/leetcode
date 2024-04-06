class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int max = 0;
        int[] arr = new int[128];        
        Arrays.fill(arr, -1);
        
        int start = 0;
        
        for(int i=0; i<s.length(); i++){
            if(arr[s.charAt(i)] >= start){
                start = arr[s.charAt(i)]+1;
            } 
            max = Math.max(max, i - start + 1);            
            arr[s.charAt(i)] = i;            
        }
                
        return max;
    }
}