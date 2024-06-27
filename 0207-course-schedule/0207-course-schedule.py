class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        indegree = [0] * numCourses
        adj = [ [] for _ in range(numCourses)]
 
        for after, pre in prerequisites:
            adj[pre].append(after)
            indegree[after] += 1

        arr = [ i for i in range(numCourses) if indegree[i] == 0 ] 

        for i in arr:
            for c in adj[i]:
                indegree[c] -= 1
                if indegree[c] == 0:
                    arr.append(c)
        
        return numCourses == len(arr)
