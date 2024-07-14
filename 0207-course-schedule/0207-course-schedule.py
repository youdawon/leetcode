class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:

        indegree = [0]*numCourses
        courses = [ [] for _ in range(numCourses)]

        for i in range(len(prerequisites)):
            currCourse, preCourse = prerequisites[i]
            indegree[currCourse] += 1
            courses[preCourse].append(currCourse)

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

        print(count)

        if numCourses == count:
            return True
        else: 
            return False