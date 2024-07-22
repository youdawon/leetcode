class TimeMap:

    def __init__(self):
        self.keyMap = collections.defaultdict(list)
        self.valueMap = collections.defaultdict(str)
        

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.keyMap[key] = self.keyMap.get(key, []) + [timestamp]
        self.valueMap[timestamp] = value

    def get(self, key: str, timestamp: int) -> str:

        arr = self.keyMap[key]

        left = 0
        right = len(arr)-1
        res = ""

        while left <= right:
            mid = left + (right-left) // 2

            print(mid)
            if arr[mid] <= timestamp:
                res = self.valueMap[arr[mid]]
                left = mid+1
            else:
                right = mid-1
        
        return res


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)