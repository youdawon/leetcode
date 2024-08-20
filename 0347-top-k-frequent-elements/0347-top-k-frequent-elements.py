import heapq


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count = collections.Counter(nums)

        maxHeap = [ (-value, key) for key, value in count.items()]
        heapq.heapify(maxHeap)

        res = []

        while k > 0 :
            value, key = heapq.heappop(maxHeap)
            res.append(key)
            k -= 1

        return res