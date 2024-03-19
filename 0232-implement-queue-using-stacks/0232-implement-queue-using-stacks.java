class MyQueue {
    
    Stack<Integer> stack;
    Stack<Integer> tempStack;

    public MyQueue() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        
        int n = 0;

        while(stack.size() > 0){
            if(n < stack.size() - 1){
                tempStack.push(stack.pop());            
            } else {
                n = stack.pop();
            }
        }
        
        while(tempStack.size() > 0){
            stack.push(tempStack.pop());
        }        
        
        return n;
    }
    
    public int peek() {
        
        int n = 0;
        
        while(stack.size() > 0){
            if(n < stack.size() - 1){
                tempStack.push(stack.pop());            
            } else {
                n = stack.pop();
                tempStack.push(n);                            
            }
        }
        
        while(tempStack.size() > 0){
            stack.push(tempStack.pop());
        }        
        return n;        
    }
    
    public boolean empty() {
     
        if(stack.size() > 0)
            return false;
        
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */