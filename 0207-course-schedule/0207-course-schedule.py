class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        graph = [ [] for _ in range(numCourses)]
        indegree = [ 0 for _ in range(numCourses)]

        for end, start in prerequisites:
            graph[start].append(end)
            indegree[end] += 1

        q = deque()

        for i in range(len(indegree)):
            if indegree[i] == 0:
                q.append(i)

        vertex_count = 0

        while q:
            i = q.popleft()
            vertex_count += 1

            for neighbor in graph[i]:
                indegree[neighbor] -= 1

                if indegree[neighbor] == 0:
                    q.append(neighbor)

        return False if vertex_count != numCourses else True