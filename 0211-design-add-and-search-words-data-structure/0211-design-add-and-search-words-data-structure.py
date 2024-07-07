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

        def searchTheWord(word, root):
            current = root

            for i in range(len(word)):
                if word[i] == ".":
                    for node in current.children:
                        if node is not None and searchTheWord(word[i+1:], node):
                            return True
                    return False
                elif current.children[ord(word[i])-ord('a')] is None:
                    return False
                current = current.children[ord(word[i])-ord('a')]        

            return current.isEndOfWord
        
        return searchTheWord(word, self.root)


# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)