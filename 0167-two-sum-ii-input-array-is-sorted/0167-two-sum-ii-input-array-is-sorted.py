class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        left = 0
        right = len(numbers)-1

        while left < right:
            currSum = numbers[left] + numbers[right]

            if currSum == target:
                return [left+1, right+1]

            if currSum < target:
                left += 1
            else:
                right -= 1