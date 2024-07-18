class Solution:
    def evalRPN(self, tokens: List[str]) -> int:

        stack = []        

        for token in tokens:
            if token in "+-*/":
                right = stack.pop()
                left = stack.pop()
                if token == "+":
                    stack.append(int(left)+int(right))
                elif token == "-":
                    stack.append(int(left)-int(right))
                elif token == "*":
                    stack.append(int(left)*int(right))
                elif token == "/":
                     stack.append(int(left)//int(right)) 
            else:
                stack.append(int(token))

        return stack[-1]                               