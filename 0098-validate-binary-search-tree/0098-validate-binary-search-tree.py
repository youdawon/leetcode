# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        
        def isBSTValid(root, minNode, maxNode):

            if root is None:
                return True
            
            if minNode and minNode.val >= root.val:
                return False
            elif maxNode and maxNode.val <= root.val:
                return False

            return isBSTValid(root.left, minNode, root) and isBSTValid(root.right, root, maxNode)

        return isBSTValid(root, None, None)