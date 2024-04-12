class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        map = collections.defaultdict(int)
        map[0] = 1
        currSum=count=0
        
        for i in range(len(nums)):
            currSum += nums[i]
            
            count += map.get(currSum-k, 0)
                
            map[currSum] = map.get(currSum, 0) + 1

        return count
                
            
            
            