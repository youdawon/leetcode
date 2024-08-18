class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        graph = [ [] for _ in range(numCourses)]
        visited = [ 0 for _ in range(numCourses)]

        for end, start in prerequisites:
            graph[start].append(end)

        
        for num in range(numCourses):
            if not self.dfs(graph, visited, num):
                return False
        
        return True

    
    def dfs(self, graph, visited, num):

        if visited[num] == -1:
            return False
        
        if visited[num] == 1:
            return True

        visited[num] = -1

        for neighbor in graph[num]:
            if not self.dfs(graph, visited, neighbor):
                return False

        visited[num] = 1        

        return True
