class Node:
    def __init__(self, value):
        self.value = value
        self.parent = self
        self.size = 1

class UnionFind:
    def findParent(self, node):
        if node != node.parent:
            return self.findParent(node.parent)
        return node.parent

    def union(self, node1, node2):
        parent1 = self.findParent(node1)
        parent2 = self.findParent(node2)

        if parent1 != parent2:
            parent2.parent = parent1
            parent1.size += parent2.size
        
        return parent1.size

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        maxLength = 0
        nodes = {}
        uf = UnionFind()

        for i in range(len(nums)):
            if nums[i] not in nodes:
                node = Node(nums[i])
                nodes[nums[i]] = node
                currLength = 1
                if nums[i]-1 in nodes:
                    currLength = uf.union(nodes[nums[i]-1], nodes[nums[i]])
                if nums[i]+1 in nodes:
                    currLength = uf.union(nodes[nums[i]], nodes[nums[i]+1])
                maxLength = max(maxLength, currLength)

        return maxLength
