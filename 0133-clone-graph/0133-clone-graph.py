"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:

        #Time Complexity : O(N)
        #Space Complexity : O(N)

        if node is None:
            return

        nodeMap = {node : Node(node.val)}

        q = deque([node])

        while q:
            currNode = q.popleft()
            newNode = nodeMap[currNode]
            for nextNode in currNode.neighbors:
                if nextNode not in nodeMap:
                    nodeMap[nextNode] = Node(nextNode.val)
                    q.append(nextNode)

                newNode.neighbors.append(nodeMap[nextNode])


        return nodeMap[node]