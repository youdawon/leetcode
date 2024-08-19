class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        #Time complexity : O(N)
        #Space complexity : O(N)        

        hash_set = set()
        
        for num in nums:
            if num in hash_set:
                return True
            hash_set.add(num)

        return False