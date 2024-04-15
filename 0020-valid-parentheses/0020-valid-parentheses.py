class Solution:
    def isValid(self, s: str) -> bool:

        brackets = []

        for c in s:            
            match c:
                case '(':
                    brackets.append(')');
                case '[':
                    brackets.append(']');                
                case '{':
                    brackets.append('}');                                    
                case _:
                    if len(brackets) == 0 or brackets.pop() != c:
                        return False
                        # if b != c:
                        #     return False

        if len(brackets) > 0:
            return False
                        
        return True