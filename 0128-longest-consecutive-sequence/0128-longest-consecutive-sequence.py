class Node:
    def __init__(self, value):
        self.value = value
        self.parent = self
        self.size = 1

class UnionFind:
    def find(self, node):
        if node != node.parent:
            node.parent = self.find(node.parent)
        return node.parent

    def union(self, node1, node2):
        parent1 = self.find(node1)
        parent2 = self.find(node2)

        if parent1 != parent2:
            parent2.parent = parent1
            parent1.size += parent2.size

        return parent1.size      


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        currLength, maxLength = 0, 0
        nodes = {}
        uf = UnionFind()

        for num in nums:
            if num not in nodes:
                nodes[num] = Node(num)
                currLength = 1
                if num-1 in nodes:
                    currLength = uf.union(nodes[num-1], nodes[num])
                if num+1 in nodes:
                    currLength = uf.union(nodes[num], nodes[num+1])
                maxLength = max(maxLength, currLength)
        
        return maxLength