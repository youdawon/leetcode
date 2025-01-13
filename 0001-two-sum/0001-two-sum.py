class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        arr = {}

        for i in range(0, len(nums)):
            remainder = target - nums[i]
            if remainder in arr:
                return [arr[remainder], i]

            arr[nums[i]] = i            

        return []