class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        group = collections.defaultdict(list) 
    
        for s in strs: ## O(N)
            sorted_s = ''.join(sorted(s)) ## O(k logk)
            group[sorted_s].append(s)

        ## Time : O(N)
        ## Space : O(N)

        return group.values()