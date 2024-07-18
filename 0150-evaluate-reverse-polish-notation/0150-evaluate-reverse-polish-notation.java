class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        

        for(String token : tokens){

            if(token.length() == 1 && token.charAt(0) - '0' < 0){
                int right = stack.pop();
                int left = stack.pop();

                if (token.equals("+")){
                    stack.push(left+right);
                } else if (token.equals("-")){
                    stack.push(left-right);
                } else if (token.equals("*")){
                    stack.push(left*right);                    
                } else {
                    stack.push(left/right);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}