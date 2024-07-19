class Solution:
    def letterCombinations(self, digits: str) -> List[str]:

        if not digits:
            return []
        
        numMap = {"2":"abc", "3":"def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}
        res = []

        def dfs(current, i):

            if i == len(digits):
                res.append(current)
                return

            curString = numMap[digits[i]]

            for j in range(len(curString)):
                current += curString[j]
                dfs(current, i+1)
                current = current[0:len(current)-1]


        dfs("", 0)
        
        return res
