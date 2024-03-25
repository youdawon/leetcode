class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i=0; 
        int j=0;
        
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();        
        
        while(i < s.length() || j < t.length()){            
            
            if(i< s.length()){            
                if(s.charAt(i) != '#'){
                    sStack.push(s.charAt(i));
                } else {
                    if(!sStack.isEmpty())
                        sStack.pop();
                }                
            }
            
            if(j< t.length()){            
                if(t.charAt(j) != '#'){
                    tStack.push(t.charAt(j));
                } else {
                    if(!tStack.isEmpty())
                        tStack.pop();
                }                
            }            
            i++;
            j++;
        }            
        
        if(sStack.size() != tStack.size())
            return false;
        
        int k=0;
        
        while(k < sStack.size()){
           if(sStack.pop() != tStack.pop())
               return false;
        }
        
        return true;
    }
}