"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:

        # Time : O(V+E)
        # Space : O(V+E)        

        if node is None:
            return
        
        q = deque() # O(1)
        q.append(node) # O(1)
        nodeMap = {node.val : Node(node.val)} # O(1)

        while q: # O(V)
            currNode = q.popleft()
            newNode = nodeMap[currNode.val]
            for neighbor in currNode.neighbors: #O(E)
                if neighbor.val not in nodeMap:
                    nodeMap[neighbor.val] = Node(neighbor.val)
                    q.append(neighbor)
                newNode.neighbors.append(nodeMap[neighbor.val])

        
        return nodeMap[node.val]