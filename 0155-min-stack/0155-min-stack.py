class MinStack:

    def __init__(self):
        self.stack = []
        self.tempStack = []
        self.minStack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

        while self.minStack and self.minStack[-1] < val:
            self.tempStack.append(self.minStack.pop())

        self.minStack.append(val)

        while self.tempStack:
            self.minStack.append(self.tempStack.pop())        

        
    def pop(self) -> None:
        num = self.stack.pop()

        while self.minStack:
            if self.minStack[-1] == num:
                self.minStack.pop()
                break
            
            self.tempStack.append(self.minStack.pop())

        while self.tempStack:
            self.minStack.append(self.tempStack.pop())                
        

    def top(self) -> int:
        if self.stack:
            return self.stack[-1]        

    def getMin(self) -> int:
        if self.minStack:
            return self.minStack[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()