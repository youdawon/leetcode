class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        
        #Time Complexity : O(N*log(K))
        #Space Comelexity : O(N)

        maxHeap = []
        for point in points:
            distance = point[0]**2 + point[1]**2
            heapq.heappush(maxHeap, (-distance, point))
            if len(maxHeap) > k:
                heapq.heappop(maxHeap)
        res = []
        for value in maxHeap:
            res.append(value[1])
        return res