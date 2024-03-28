class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int left = 0;
        int right = 0;        
        
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                right = stack.pop();            
                left = stack.pop();
            }
            
            if(tokens[i].equals("+")){
                stack.push(left + right);
            } else if(tokens[i].equals("-")){
                stack.push(left - right);
            } else if(tokens[i].equals("*")){
                stack.push(left * right);
            } else if(tokens[i].equals("/")){
                stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.pop();
    }
}