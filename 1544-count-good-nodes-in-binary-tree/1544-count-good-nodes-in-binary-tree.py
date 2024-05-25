# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:

        self.count = 0

        def getGoodNodes(root, maxVal):

            if not root:
                return

            if maxVal <= root.val:
                print(maxVal, root.val)
                self.count += 1

            maxVal = max(maxVal, root.val)

            getGoodNodes(root.left, maxVal)
            getGoodNodes(root.right, maxVal)            

        getGoodNodes(root, root.val)

        return self.count