# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        maxWidth = 0
        queue = deque([[1, root]])

        while queue:
            lenQ = len(queue)
            num_old = queue[0][0]
            for i in range(lenQ):
                [num, node] = queue.popleft()
                if node.left:  queue.append([num*2, node.left])
                if node.right: queue.append([num*2+1, node.right])
            maxWidth = max(maxWidth, num - num_old + 1)
        return maxWidth