class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i=0; 
        int j=0;
        
        String sResult = "";
        String tResult = "";
        
        while(i < s.length() || j < t.length()){            
            if(i < s.length()){
                if(sResult.length() > 0 && s.charAt(i) == '#'){
                    sResult = sResult.substring(0, sResult.length()-1);
                } else if(s.charAt(i) != '#'){
                    sResult += s.charAt(i);                    
                }
            } 
            
            if(j < t.length()){
                if(tResult.length() > 0 && t.charAt(j) == '#'){                
                    tResult = tResult.substring(0, tResult.length()-1);
                } else if(t.charAt(j) != '#'){
                    tResult += t.charAt(j);
                }
            }          
            i++;
            j++;
        }  

        if(sResult.equals(tResult))
            return true;
        
        return false;
    }
}