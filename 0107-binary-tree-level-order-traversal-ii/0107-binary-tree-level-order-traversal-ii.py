# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        
        self.res = []
        
        def dfs(root, level):

            if root is None:
                return 

            if len(self.res) == level:
                self.res.append([root.val])
            else:
                self.res[level].append(root.val)
            
            dfs(root.left, level+1)
            dfs(root.right, level+1)

        dfs(root, 0)

        return self.res[::-1]