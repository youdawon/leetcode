class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.length() == 1 && token.charAt(0) - '0' < 0){
                int rightNum = stack.pop();
                int leftNum = stack.pop();                
                switch(token){
                    case "+":
                        stack.push(leftNum+rightNum);
                    break;
                    case "-":
                        stack.push(leftNum-rightNum);
                    break;
                    case "*":
                        stack.push(leftNum*rightNum);                    
                    break;
                    case "/":
                        stack.push(leftNum/rightNum);                    
                    break;                                                            
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();        
    }
}