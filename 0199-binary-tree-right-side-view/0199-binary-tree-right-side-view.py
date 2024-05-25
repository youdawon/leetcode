# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        
        res = []

        def getRightSide(root, level):

            if not root:
                return

            if len(res) < level:
                res.append(root.val)
            
            getRightSide(root.right, level + 1)
            getRightSide(root.left, level + 1)

        getRightSide(root, 1)

        return res