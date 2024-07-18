class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        
        maxHeap = []

        for point in points:
            distance = point[0]*point[0] + point[1]*point[1]
            heapq.heappush(maxHeap, (-distance, point))

            if len(maxHeap) > k:
                heapq.heappop(maxHeap)

        res = []

        for value in maxHeap:
            res.append(value[1])

        return res