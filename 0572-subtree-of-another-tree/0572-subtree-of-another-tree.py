# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:

        if root is None and subRoot:
            return False
        
        if root and subRoot is None:
            return False
        
        if root is None and subRoot is None:
            return True

        if self.isIdentical(root, subRoot):
            return True

        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)

    def isIdentical(self, root, subRoot):

        if root is None and subRoot is None:
            return True

        if root is None or subRoot is None:
            return False

        if root.val != subRoot.val:
            return False

        return self.isIdentical(root.left, subRoot.left) and self.isIdentical(root.right, subRoot.right)