class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:

        ## Time Complexity : O(V+E)
        ## Space Compelxity : O(V+E)

        indegree = [ 0 for _ in range(numCourses)]
        courses = [ [] for _ in range(numCourses)]

        for j, i in prerequisites:
            indegree[j] += 1
            courses[i].append(j)

        q = deque()

        for num in range(numCourses):
            if indegree[num] == 0:
                q.append(num)

        count = 0

        while q:
            preCourse = q.popleft()
            count += 1

            for currCourse in courses[preCourse]:
                indegree[currCourse] -= 1

                if indegree[currCourse] == 0:
                    q.append(currCourse)

        if numCourses == count:
            return True
        else: 
            return False