class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:

        ##Time Compleixty : O(N^2)
        ##Space Complexity : O(N)

        res = []

        def getSubSets(current, currIndex):

            if currIndex == len(nums):
                res.append(current.copy())
                return

            current.append(nums[currIndex])
            getSubSets(current, currIndex+1) 
            current.pop()
            getSubSets(current, currIndex+1)           

        getSubSets([], 0)


        return res