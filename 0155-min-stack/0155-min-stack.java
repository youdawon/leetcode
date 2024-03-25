class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> tempStack;
    int min;

    public MinStack() {
        stack = new Stack<>();
        tempStack = new Stack<>();       
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);  
        
        if(!stack.isEmpty()){
            if(val < min){
                min = val;
            }
        }
    }
    
    public void pop() {
        int popValue = stack.pop();        
        min = Integer.MAX_VALUE;
        
        while(!stack.isEmpty()){
            if(min > stack.peek())
                min = stack.peek();
            tempStack.push(stack.pop());
        }        
        
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        if(stack.isEmpty())
            return 0;
        
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */