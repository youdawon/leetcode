class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
    
        answer = -inf

        nums.sort()

        for i in range(len(nums)):
    
            left = i + 1
            right = len(nums)-1

            if i > 0 and nums[i-1] == nums[i]:
                continue

            while left < right:
                currSum = nums[i] + nums[left] + nums[right]
                if currSum == target:
                    return currSum
                                
                if abs(target-answer) > abs(target-currSum):
                    answer = currSum

                if currSum < target:
                    left += 1
                else:
                    right -= 1

        return answer        