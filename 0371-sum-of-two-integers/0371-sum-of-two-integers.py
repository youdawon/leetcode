class Solution:
    def getSum(self, a: int, b: int) -> int:
        
        mask = 0xffffffff        

        while (b & mask) > 0:
            carry = a & b
            a = a ^ b
            b = carry << 1

        return (a & mask) if b > 0 else a