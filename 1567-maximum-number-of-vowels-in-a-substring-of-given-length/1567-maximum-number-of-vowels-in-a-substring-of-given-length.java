class Solution {
    public int maxVowels(String s, int k) {
        
        int res = 0;
        int left = 0;
        int vowelCount = 0;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(int right=0; right<s.length(); right++){
            if (vowels.contains(s.charAt(right))) vowelCount += 1;

            if (right >= k && vowels.contains(s.charAt(right-k))) vowelCount -= 1;

            res = Math.max(res, vowelCount);
        }

        return res;
    }
}