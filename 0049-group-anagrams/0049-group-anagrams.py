class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        word_map = collections.defaultdict(list)

        for word in strs:
            word_map["".join(sorted(word))].append(word)  

        return word_map.values()