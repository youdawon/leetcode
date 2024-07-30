class Node:

    def __init__(self, value):
        self.value = value
        self.next = [None] * 26
        self.isEndOfWord = False

class WordDictionary:

    def __init__(self): 
        self.node = Node("")
        

    def addWord(self, word: str) -> None:
        current = self.node
        for c in word:
            if current.next[ord(c) - ord('a')] is None:
                current.next[ord(c) - ord('a')] = Node(c)
            current = current.next[ord(c) - ord('a')]
        current.isEndOfWord = True

    def search(self, word: str) -> bool:
        return self.searchWord(word, 0, self.node)

    
    def searchWord(self, word, index, node):

        if node is None:
            return False

        if index == len(word):
            return node.isEndOfWord

        if word[index] == ".":
            for nextNode in node.next:
                if self.searchWord(word, index+1, nextNode):
                    return True
            return False

        if node.next[ord(word[index]) - ord('a')] is None:
            return False

        return self.searchWord(word, index+1, node.next[ord(word[index]) - ord('a')])

# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)