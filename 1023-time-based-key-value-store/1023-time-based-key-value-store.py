class TimeMap:

    def __init__(self):
        self.data = collections.defaultdict(list)
        
    def set(self, key: str, value: str, timestamp: int) -> None:
        self.data[key].append([timestamp, value])

    def get(self, key: str, timestamp: int) -> str:

        arr = self.data[key]
        low, high = 0, len(arr)-1
        res = ""

        while low <= high:
            mid = (low + high) // 2
            if timestamp >= arr[mid][0]:
                res = arr[mid][1]
                low = mid+1
            else:
                high = mid-1

        return res

# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)