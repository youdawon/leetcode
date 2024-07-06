class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        numSet = set(nums)
        answer = 0

        for num in numSet:
            if num - 1 not in numSet:
                nextNum = num + 1
                while nextNum in numSet:
                    nextNum += 1
                answer = max(answer, nextNum - num)
        
        return answer