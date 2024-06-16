class Solution:
    def myAtoi(self, s: str) -> int:
        
        s = s.strip()

        if not s:
            return 0

        sign = 1
        i = 0

        res = 0

        if s[0] == "-":
            sign = -1
            i += 1
        elif s[0] == "+":
            i += 1

        if i == len(s) or not s[i].isdigit():
            return 0
        
        letter = ""       
        for j in range(i, len(s)):
            
            if not s[j].isdigit():
                break
            letter += s[j]

        if not letter:
            return 0
        
        res = int(letter) * sign

        if res > 2**31 - 1:
            return 2**31 - 1
        
        if res < -2**31:
            return -2**31

        return res