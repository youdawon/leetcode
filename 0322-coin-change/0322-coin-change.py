class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        arr = [0] + [ amount+1 for i in range(amount)]
        
        for i in range(1, amount+1):
            for coin in coins:
                if i < coin:
                    continue
                arr[i] = min(arr[i], arr[i-coin]+1)

        return arr[-1] if arr[-1] != amount+1 else -1