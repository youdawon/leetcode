class RandomizedSet:

    def __init__(self):
        self.valueSet = set()

    def insert(self, val: int) -> bool:
        if val in self.valueSet:
            return False
        
        self.valueSet.add(val)
        return True
        

    def remove(self, val: int) -> bool:
        if not val in self.valueSet:        
            return False

        self.valueSet.remove(val)
        return True

    def getRandom(self) -> int:
        arr = list(self.valueSet)
        index = random.randint(0, len(arr) - 1)
        return arr[index]


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()