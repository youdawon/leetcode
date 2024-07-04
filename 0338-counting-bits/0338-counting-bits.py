class Solution:
    def countBits(self, n: int) -> List[int]:

        arr = []
        
        for num in range(n+1):
            count = 0
            while num > 0:
                if num & 1 == 1:
                    count += 1
                num = num >> 1
            arr.append(count)

        return arr
