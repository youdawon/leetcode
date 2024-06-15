class Solution:
    def myAtoi(self, s: str) -> int:

        res = 0

        s = s.strip()

        if not s:
            return 0

        i = 0
        sign = 1

        if s[i] == '-':
            sign = -1
            i += 1
        elif s[i] == '+':
            i += 1

        j = i
        num = ""

        while j < len(s):
            if not s[j].isdigit():
                break
            num += s[j]
            j += 1
                
        if not num:
            return 0
            
        res = int(num) * sign

        if res < -2**31:
            return -2**31
        
        if res > 2**31-1:
            return 2**31-1

        return res