class TreeNode:
    def __init__(self, value):
        self.value = value
        self.isEndOfWord = False
        self.next = [None] * 26

class Trie:

    def __init__(self):
        self.head = TreeNode("")
        

    def insert(self, word: str) -> None:

        current = self.head

        for c in word:
            if current.next[ord(c) - ord('a')] is None:
                current.next[ord(c) - ord('a')] = TreeNode(c)
            current = current.next[ord(c) - ord('a')]

        current.isEndOfWord = True

    def search(self, word: str) -> bool:
        current = self.head

        for c in word:
            if current.next[ord(c) - ord('a')] is None:
                return False
            current = current.next[ord(c) - ord('a')]

        return current.isEndOfWord

    def startsWith(self, prefix: str) -> bool:
        current = self.head

        for c in prefix:
            if current.next[ord(c) - ord('a')] is None:
                return False
            current = current.next[ord(c) - ord('a')]

        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)