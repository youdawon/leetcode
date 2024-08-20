class Node:
    def __init__(self, value):
        self.value = value
        self.parent = self
        self.size = 1

class UnionFind:
    def find(self, node1):
        if node1 == node1.parent:
            return node1
        return self.find(node1.parent)

    def union(self, node1, node2):
        parent1 = self.find(node1)
        parent2 = self.find(node2)

        if parent1 != parent2:
            parent2.parent = parent1
            parent1.size += parent2.size
        return parent1.size

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        hashmap = {}
        uf = UnionFind()
        maxSize, size = 0, 0

        for num in nums:
            if num not in hashmap:
                hashmap[num] = Node(num)
                size = 1
                if num-1 in hashmap:
                    size = uf.union(hashmap[num-1], hashmap[num])
                if num+1 in hashmap:
                    size = uf.union(hashmap[num], hashmap[num+1])

            maxSize = max(maxSize, size)

        return maxSize