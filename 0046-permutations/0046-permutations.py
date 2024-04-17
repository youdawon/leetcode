class Solution:
 def permute(self, nums: List[int]) -> List[List[int]]:

        res = []

        def dfs(res, current, nums, used):

            if len(current) == len(nums):
                res.append(current.copy())
                return

            for i in range(0, len(nums)):
                if used[i] is False:
                    used[i] = True
                    current.append(nums[i])
                    dfs(res, current, nums, used)                
                    used[i] = False
                    current.pop()

        dfs(res, [], nums, [False]*len(nums))            
        
        return res