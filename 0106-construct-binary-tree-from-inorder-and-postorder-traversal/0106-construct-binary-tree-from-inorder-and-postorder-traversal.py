# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:

        if inorder:
            num = postorder.pop()
            root = TreeNode(num)

            rootIndex = inorder.index(num)
            root.right = self.buildTree(inorder[rootIndex+1:], postorder)                        
            root.left = self.buildTree(inorder[0:rootIndex], postorder)

            return root