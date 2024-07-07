# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        
        stack = []
        current = root

        while current or stack:
            while current:
                stack.append(current)
                current = current.left
            currNode = stack.pop()
            k -= 1
            if k == 0: return currNode.val            
            if currNode.right:
                current = currNode.right

        
        return 0
