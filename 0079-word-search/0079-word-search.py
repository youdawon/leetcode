class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        
        m, n = len(board)-1, len(board[0])-1

        def bfs(i, j, index, visited):   

            if len(word) == index:
                return True

            if i < 0 or j < 0 or i > m or j > n or (i, j) in visited:
                return False

            if board[i][j] != word[index]:
                return False

            visited.add((i, j))

            res = (bfs(i-1, j, index+1, visited) or 
            bfs(i+1, j, index+1, visited) or 
            bfs(i, j-1, index+1, visited) or 
            bfs(i, j+1, index+1, visited))

            visited.remove((i, j))

            return res


        for i in range(m+1):
            for j in range(n+1):
                if bfs(i, j, 0, set()):
                    return True
        
        return False