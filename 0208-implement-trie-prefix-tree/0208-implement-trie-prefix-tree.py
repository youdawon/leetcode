class Node:
    def __init__(self, value):
        self.value = value
        self.children = [None]*26
        self.isEndOfWord = False

class Trie:

    def __init__(self):
        self.root = Node("")        

    def insert(self, word: str) -> None:
        current = self.root

        for c in word:
            if current.children[ord(c)-ord('a')] is None:
                current.children[ord(c)-ord('a')] = Node(c)
            current = current.children[ord(c)-ord('a')]
        current.isEndOfWord = True

    def search(self, word: str) -> bool:
        current = self.root

        for c in word:
            if current.children[ord(c)-ord('a')] is None:
                return False
            current = current.children[ord(c)-ord('a')]

        return current.isEndOfWord

    def startsWith(self, prefix: str) -> bool:
        current = self.root

        for c in prefix:
            if current.children[ord(c)-ord('a')] is None:
                return False
            current = current.children[ord(c)-ord('a')]

        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)