# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        if root is None:
            return []

        res = []

        queue = deque([root])
        count = 0

        while queue:
            size = len(queue)
            current = []
            for _ in range(size):
                node = queue.popleft()
                current.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)                
            if count % 2 == 0:
                res.append(current)
            else:
                res.append(current[::-1])                
            count += 1
 
        return res