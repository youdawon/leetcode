class TimeMap:

    def __init__(self):
        self.keyMap = collections.defaultdict(list)        

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.keyMap[key].append([timestamp, value])

    def get(self, key: str, timestamp: int) -> str:

        arr = self.keyMap[key]

        left = 0
        right = len(arr)-1
        res = ""

        while left <= right:
            mid = left + (right-left) // 2

            if arr[mid][0] <= timestamp:
                res = arr[mid][1]
                left = mid+1
            else:
                right = mid-1
        
        return res


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)