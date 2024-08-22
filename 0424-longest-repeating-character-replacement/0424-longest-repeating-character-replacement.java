class Solution {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        int arr[] = new int[26];
        int maxCount = 0;

        int left = 0;
        for(int right=0; right<s.length(); right++){
            arr[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, arr[s.charAt(right) - 'A']);

            while(right-left-maxCount+1 > k){
                arr[s.charAt(left) - 'A'] -= 1;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);            
        }    

        return maxLength;    
    }
}