class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        word_map = {}

        for word in strs:
            sorted_word = "".join(sorted(word))            
            if sorted_word in word_map:
                word_map[sorted_word].append(word)  
            else:
                word_map[sorted_word] = [word]                

        return word_map.values()