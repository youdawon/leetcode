class RandomizedSet:

    def __init__(self):
        self.valueArr = []
        self.valueMap = collections.defaultdict(int) 

    def insert(self, val: int) -> bool:
        if val in self.valueMap:
            return False
        
        self.valueArr.append(val)
        self.valueMap[val] = len(self.valueArr)-1
        return True
        

    def remove(self, val: int) -> bool:
        if not val in self.valueMap:        
            return False

        i = self.valueMap[val]

        self.valueMap[self.valueArr[-1]] = i        
        self.valueArr[i] = self.valueArr[-1]
        
        del self.valueMap[val]
        self.valueArr.pop()

        return True

    def getRandom(self) -> int:
        index = random.randint(0, len(self.valueArr) - 1)
        return self.valueArr[index]


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()