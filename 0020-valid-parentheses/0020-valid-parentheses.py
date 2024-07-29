class Solution:
    def isValid(self, s: str) -> bool:

        # Time : O(N)
        # Space : O(N)

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
                if stack[-1] != c:
                    return False
                stack.pop()

        return True if not stack else False
