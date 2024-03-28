class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int left = 0;
        int right = 0;        
        
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();        
        
        for(String token : tokens){   
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            right = stack.pop();            
            left = stack.pop();
            }
            
            if(token.equals("+")){
                stack.push(left + right);
            } else if(token.equals("-")){
                stack.push(left - right);
            } else if(token.equals("*")){
                stack.push(left * right);
            } else if(token.equals("/")){
                stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}