class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 1)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if(c == '{'){
                stack.push('}');
            } else if(c == '['){
                stack.push(']');
            } else if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            } else {
                return false;
            }
        }      
        
        return stack.size() == 0 ? true : false;
    }
}