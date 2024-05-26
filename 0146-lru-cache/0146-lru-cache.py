class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity 
        self.head = Node(-1, -1)
        self.tail = Node(-1, -1)
        self.head.next = self.tail
        self.tail.prev = self.head
        self.cacheMap = collections.defaultdict(Node)

    def get(self, key: int) -> int:
        if key in self.cacheMap:
            node = self.cacheMap[key]
            self.removeNode(node)
            self.addNodeToHead(node)
            self.cacheMap[key] = node
            return node.value
        else:
            return -1

    def put(self, key: int, value: int) -> None:
        if key in self.cacheMap:
            self.removeNode(self.cacheMap[key])
            del self.cacheMap[key]

        newNode = Node(key, value)            
        self.addNodeToHead(newNode)
        self.cacheMap[key] = newNode

        if len(self.cacheMap) > self.capacity:
            prevNode = self.head.next
            self.removeNode(prevNode)
            del self.cacheMap[prevNode.key]

    def removeNode(self, node):
        prevNode = node.prev
        nextNode = node.next
        prevNode.next = nextNode
        nextNode.prev = prevNode

    def addNodeToHead(self, node):
        prevNode = self.tail.prev
        prevNode.next = node
        self.tail.prev = node
        node.next = self.tail
        node.prev = prevNode

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)