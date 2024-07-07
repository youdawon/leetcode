class Node:
    def __init__(self, value):
        self.value = value
        self.children = [None]*26
        self.isEndOfWord = False

class WordDictionary:

    def __init__(self):
        self.root = Node("")
        

    def addWord(self, word: str) -> None:

        current = self.root

        for c in word:
            if current.children[ord(c)-ord('a')] is None:
                current.children[ord(c)-ord('a')] = Node(c)
            current = current.children[ord(c)-ord('a')]

        current.isEndOfWord = True


    def search(self, word: str) -> bool:

        def dfs(i, current):

            if i == len(word):
                return current.isEndOfWord

            c = word[i]

            if c == ".":
                for node in current.children:
                    if node and dfs(i+1, node):
                        return True
                return False
            elif current.children[ord(word[i])-ord('a')] is None:
                return False
            
            return dfs(i+1, current.children[ord(word[i])-ord('a')])
        
        return dfs(0, self.root)



# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)