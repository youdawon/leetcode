class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:

        #Time Complexity : O(m*n*4*len(word))
        #Space Complexity : O(m*n)

        m, n = len(board), len(board[0])
        
        def searchWord(i, j, index, visited):
            
            if index == len(word):
                return True

            if i < 0 or j < 0 or i >= m or j >= n:
                return False

            if (i, j) in visited:
                return False

            if board[i][j] != word[index]:
                return False

            visited.add((i, j))

            res = (searchWord(i-1, j, index+1, visited) or 
            searchWord(i+1, j, index+1, visited) or 
            searchWord(i, j-1, index+1, visited) or 
            searchWord(i, j+1, index+1, visited))

            visited.remove((i, j))

            return res
    
        for i in range(len(board)):
            for j in range(len(board[0])):
                print(board[i][j])
                if searchWord(i, j, 0, set()):
                    return True

        return False