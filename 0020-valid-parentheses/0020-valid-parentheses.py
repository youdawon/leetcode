class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        
        for c in s:
            if c == "(":
                stack.append(")")
            elif c == "[":
                stack.append("]")
            elif c == "{":
                stack.append("}")
            else:
                if not stack:
                    return False
                
                val = stack.pop()
                if c != val:
                    return False

        return True if not stack else False
