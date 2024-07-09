class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count = collections.Counter(nums)

        maxHeap = [ [-value, num] for num, value in count.items() ]
        heapq.heapify(maxHeap)

        res = []

        while k > 0:
            num = heapq.heappop(maxHeap)[1]
            res.append(num)
            k -= 1

        return res