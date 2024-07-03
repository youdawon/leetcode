class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        arr = [1]
        prev = 1

        for i in range(1, len(nums)):
            arr.append(arr[i-1]*nums[i-1])

        prev = 1
        lastIndex = len(nums)-1

        # 1, 1, 2, 6

        for i in range(len(nums)):
            arr[lastIndex-i] = arr[lastIndex-i]*prev
            prev = prev*nums[lastIndex-i]

        return arr