class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int left = 0;
        int right = 0;        
        
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                right = stack.pop();            
                left = stack.pop();
            }
 
            switch(token){
                case "+":
                    stack.push(left + right);
                break;
                case "-":
                  stack.push(left - right);
                break;
                case "*":
                    stack.push(left * right);
                break;
                case "/":
                    stack.push(left / right);
                break;
                default:
                    stack.push(Integer.parseInt(token));
                break;
            }
        }
        
        return stack.pop();
    }
}