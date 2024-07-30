class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:

        res = []

        def backtracking(current, currSum, index):

            if currSum == target:
                res.append(current.copy())
                return

            if currSum > target:
                return
            
            for i in range(index, len(candidates)):                
                current.append(candidates[i])
                backtracking(current, currSum + candidates[i], i)
                current.pop()

        backtracking([], 0, 0)

        return res