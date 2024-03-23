class MyQueue {
    
    Stack<Integer> originalStack;
    Stack<Integer> reverseStack;

    public MyQueue() {
        originalStack = new Stack<>();
        reverseStack = new Stack<>();        
    }
    
    public void push(int x) {    
        originalStack.push(x);        
    }
    
    public int pop() {

        while(!originalStack.isEmpty()){
            reverseStack.push(originalStack.pop());
        }
        
        int value = reverseStack.pop();
        
        while(!reverseStack.isEmpty()){
            originalStack.push(reverseStack.pop());
        }
         
        return value;        
    }
    
    public int peek() {
                
        while(!originalStack.isEmpty()){
            reverseStack.push(originalStack.pop());
        }
        
        int value = reverseStack.peek();
        
        while(!reverseStack.isEmpty()){
            originalStack.push(reverseStack.pop());
        }
        
        return value;
    }
    
    public boolean empty() {
        return originalStack.isEmpty();    
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