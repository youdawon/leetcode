class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        
        list = []

        def dfs(i, cur, total):
            if total == target:
                list.append(cur.copy())         
                return
            if i >= len(candidates) or total > target:
                return
            
            cur.append(candidates[i])
            dfs(i, cur, total + candidates[i])
            cur.pop()
            print(i)
            print("total " + str(total))
            dfs(i+1, cur, total)

            
        dfs(0, [], 0)
        
        return list
                    
                    
                    
                    
                    
                    
            
        