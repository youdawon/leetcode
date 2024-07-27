class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        group = collections.defaultdict(int) 
    
        for s in strs: ## O(N)
            sorted_s = ''.join(sorted(s)) ## O(k logk)
            group[sorted_s] = group.get(sorted_s, []) + [s]

        ## Time : O(N)
        ## Space : O(N)

        return group.values()