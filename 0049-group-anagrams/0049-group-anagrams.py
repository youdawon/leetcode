class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        groups = {}

        for word in strs:
            sorted_word = ''.join(sorted(word))
            groups[sorted_word] = groups.get(sorted_word, [])+[word]
            
        return groups.values()