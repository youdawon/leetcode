class Solution:
    def isValid(self, s: str) -> bool:

        if len(s) == 1:
            return False

        stack = []
        
        for c in s:
            if c == "(":
                stack.append(")")
            elif c == "[":
                stack.append("]")
            elif c == "{":
                stack.append("}")
            else:
                if not stack or c != stack.pop():
                    return False

        return False if stack else True