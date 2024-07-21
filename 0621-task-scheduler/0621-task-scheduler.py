class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        
        count = collections.Counter(tasks)
        maxHeap = [ -count for count in count.values() ]
        heapq.heapify(maxHeap)
        interval = 0
        q = deque()

        while maxHeap or q:
            interval += 1
            
            if maxHeap:
                task = 1 + heapq.heappop(maxHeap)

                if task:
                    q.append([task, interval+n])

            if q:
                if q[0][1] == interval:
                    heapq.heappush(maxHeap, q.popleft()[0])

        return interval

