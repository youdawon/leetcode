class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        
        res = []

        def findSum(current, currSum, currIndex):

            if currSum == target:
                res.append(current.copy())
                return
            
            if currSum > target:
                return

            for i in range(currIndex, len(candidates)):
                current.append(candidates[i])
                findSum(current, currSum+candidates[i], i)
                current.pop()                

        findSum([], 0, 0)

        return res