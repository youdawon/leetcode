# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        res = []

        def getOrderByLevel(root, level):

            #Time Complexity : O(N)
            #Space Complexity : O(N) + O(H)

            if root is None:
                return

            if len(res) == level:
                res.append([])

            res[level].append(root.val)

            getOrderByLevel(root.left, level+1)
            getOrderByLevel(root.right, level+1)            

        getOrderByLevel(root, 0)

        return res