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
            if not root:
                return 0
            
            leftSum = max(getMaxSum(root.left), 0)
            rightSum = max(getMaxSum(root.right), 0)

            currSum = max(leftSum + rightSum + root.val, root.val)
            self.maxSum = max(self.maxSum, currSum)

            return max(leftSum, rightSum) + root.val
            
        getMaxSum(root)

        return self.maxSum