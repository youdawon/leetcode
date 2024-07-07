# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def isValid(root, minNode, maxNode):

            if root is None:
                return True

            if minNode and root.val <= minNode.val:
                return False

            if maxNode and root.val >= maxNode.val:
                return False

            return isValid(root.left, minNode, root) and isValid(root.right, root, maxNode)

        return isValid(root, None, None)
