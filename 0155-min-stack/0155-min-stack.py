class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

        if not self.minStack or self.minStack[-1] >= val:
            self.minStack.append(val)

        
    def pop(self) -> None:
        num = self.stack.pop()
         
        if num == self.minStack[-1]:
            self.minStack.pop()
        

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