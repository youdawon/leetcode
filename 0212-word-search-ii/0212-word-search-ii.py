class Node:
    def __init__(self):
        self.children = [None]*26
        self.isEndOfWord = False

class Solution:

    def __init__(self):
        self.root = Node()

    def insert(self, word):

        current = self.root

        for c in word:
            if current.children[ord(c)-ord('a')] is None:
                current.children[ord(c)-ord('a')] = Node()
            current = current.children[ord(c)-ord('a')]
        
        current.isEndOfWord = True

    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        
        m, n = len(board), len(board[0])

        res = []

        for word in words:
            self.insert(word)

        def dfs(i, j, visited, root, currStr):

            if root.isEndOfWord:
                res.append(currStr)
                root.isEndOfWord = False

            if i < 0 or j < 0 or i >= m or j >= n:
                return
            
            if (i, j) in visited:
                return

            if root.children[ord(board[i][j])-ord('a')] is None:
                return

            currStr += board[i][j]
            root = root.children[ord(board[i][j])-ord('a')]

            visited.add((i, j))

            dfs(i-1, j, visited, root, currStr) 
            dfs(i+1, j, visited, root, currStr)
            dfs(i, j-1, visited, root, currStr)
            dfs(i, j+1, visited, root, currStr)

            visited.remove((i, j))

        for i in range(len(board)):
            for j in range(len(board[0])):            
                dfs(i, j, set(), self.root, "")

        return res