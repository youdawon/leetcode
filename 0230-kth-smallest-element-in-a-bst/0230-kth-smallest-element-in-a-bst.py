# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:

        stack = [root]
        current = root
        
        while stack:
            while current.left:
                stack.append(current.left)
                current = current.left
            
            node = stack.pop()
            k -= 1

            if k == 0:
                return node.val

            if node.right:
                stack.append(node.right)