class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.length() == 1 && Character.isLetter(s.toCharArray()[0]))
            return true;
        
        s = s.toLowerCase().replace(" ", "");
        
        List<Character> list = new ArrayList<>();
                
        for(char c : s.toCharArray()){
            byte by = (byte) c;
            if((by >= 48 && by <= 57)|| (by >= 97 && by <= 122)){
                list.add(c);
            }
        }
        
        int end = list.size() - 1;
        
        // if(end == 0)
        //     return false;
        
        for(int i=0; i<end; i++){
            if(list.get(i) != list.get(end-i)){
                return false;
            }
        }
        
        return true;
    }    
}