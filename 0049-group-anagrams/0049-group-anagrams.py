class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        hash_map = {}

        for s in strs:            
            sorted_word = ''.join(sorted(s))

            hash_map[sorted_word] = hash_map.get(sorted_word, []) + [s]

        return list(hash_map.values())