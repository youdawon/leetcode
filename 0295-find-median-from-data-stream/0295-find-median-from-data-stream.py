class MedianFinder:

    def __init__(self):
        self.smallHeap = []
        self.largeHeap = []
        

    def addNum(self, num: int) -> None:
        if len(self.smallHeap) == len(self.largeHeap):
            heapq.heappush(self.largeHeap, -heapq.heappushpop(self.smallHeap, -num))
        else:
            heapq.heappush(self.smallHeap, -heapq.heappushpop(self.largeHeap, num))            


    def findMedian(self) -> float:
        if len(self.smallHeap) == len(self.largeHeap):
            return float(self.largeHeap[0] - self.smallHeap[0]) / 2.0
        else:
            return float(self.largeHeap[0])

# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()