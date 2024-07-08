# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:

        self.maxSum = -inf

        def getMaxSum(root):

            if root is None:
                return 0

            leftSum = max(getMaxSum(root.left), 0)
            rightSum = max(getMaxSum(root.right), 0)

            self.maxSum = max(self.maxSum, root.val + leftSum + rightSum)

            return max(leftSum, rightSum) + root.val

        getMaxSum(root)

        return self.maxSum