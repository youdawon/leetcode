class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        count = collections.Counter(nums);

        maxHeap = [ (-count, num) for num, count in count.items() ]
        heapq.heapify(maxHeap)
        res = []

        while k > 0:
            k -= 1
            res.append(heapq.heappop(maxHeap)[1])

        return res