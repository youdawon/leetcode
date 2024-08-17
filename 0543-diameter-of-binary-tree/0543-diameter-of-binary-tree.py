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

            self.height = max(self.height, dfs(root.left) + dfs(root.right))
            
            return max(dfs(root.left), dfs(root.right)) + 1  

        dfs(root)

        return self.height