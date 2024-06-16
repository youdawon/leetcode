class Solution:
    def myAtoi(self, s: str) -> int:
        
        s = s.strip()

        if not s:
            return 0

        sign = 1
        i = 0

        res = 0

        if s[i] == "-":
            sign = -1
            i += 1
        elif s[i] == "+":
            i += 1

        letter = ""

        while i < len(s):
            if not s[i].isdigit():
                break
            letter += s[i]
            i += 1

        if not letter:
            return 0
        
        res = int(letter) * sign

        if res > 2**31 - 1:
            return 2**31 - 1
        
        if res < -2**31:
            return -2**31

        return res