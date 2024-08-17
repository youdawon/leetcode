# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:  

        self.height = 0      

        def dfs(root):

            if root is None:
                return 0

            leftLength = dfs(root.left)
            rightLength = dfs(root.right)

            self.height = max(self.height, leftLength+rightLength)
            
            return max(leftLength, rightLength) + 1  

        dfs(root)

        return self.height