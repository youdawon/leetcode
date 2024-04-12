class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        map = collections.defaultdict(int)
        map[0] = 1
        currSum=count=0
        
        for num in nums:
            currSum += num
            
            count += map.get(currSum-k, 0)
                
            map[currSum] = map.get(currSum, 0) + 1

        return count
                
            
            
            