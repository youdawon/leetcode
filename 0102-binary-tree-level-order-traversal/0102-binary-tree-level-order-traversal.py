# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        res = []

        def getOrders(level, root):

            if not root:
                return

            if len(res) >= level:
                res[level-1].append(root.val)
            else:
                res.append([root.val])

            getOrders(level + 1, root.left)
            getOrders(level + 1, root.right)

        getOrders(1, root)

        return res