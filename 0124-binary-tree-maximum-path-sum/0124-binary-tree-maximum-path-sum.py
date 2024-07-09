# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        
        self.maxSum = -inf

        def dfs(root):
            if root is None:
                return 0

            leftSum = max(dfs(root.left), 0)
            rightSum = max(dfs(root.right), 0)

            self.maxSum = max(self.maxSum, root.val + leftSum + rightSum)

            return max(leftSum, rightSum) + root.val

        dfs(root)

        return self.maxSum
