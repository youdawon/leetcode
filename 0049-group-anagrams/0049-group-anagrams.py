class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        group = collections.defaultdict(int)
    
        for s in strs:
            sorted_s = ''.join(sorted(s))
            group[sorted_s] = group.get(sorted_s, []) + [s]
            # else:
            #     group[sorted_s].append(s)                
        
        return group.values()