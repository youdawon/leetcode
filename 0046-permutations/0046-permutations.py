class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        
        res = []

        def getPermutations(current, used):

            if len(nums) == len(current):
                res.append(current.copy())
                return

            for i in range(len(nums)):
                if nums[i] not in used:
                    used.add(nums[i])
                    current.append(nums[i])
                    getPermutations(current, used)
                    current.pop()
                    used.remove(nums[i])

        getPermutations([], set())

        return res