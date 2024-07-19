class Solution:
    def letterCombinations(self, digits: str) -> List[str]:

        res = []

        if not digits:
            return res
        
        numMap = {"2":"abc", "3":"def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}

        def dfs(current, i):

            if i == len(digits):
                res.append(current)
                return

            letters = numMap[digits[i]]

            for letter in letters:
                dfs(current+letter, i+1)

        dfs("", 0)
        
        return res
