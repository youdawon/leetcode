class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if (c == '['){
                stack.push(']');
            } else if (c == '{'){
                stack.push('}');                
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char value = stack.pop();
                if(c != value && c != value && c != value){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}