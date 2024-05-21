# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        
        if not root:
            return []

        res = []

        queue = [(root, root.val, [root.val])]

        while queue:
            currNode, currSum, currArr = queue.pop(0)

            if not currNode.left and not currNode.right and currSum == targetSum:
                res.append(currArr.copy())
            if currNode.left:
                queue.append((currNode.left, currSum + currNode.left.val, currArr + [currNode.left.val]))
            if currNode.right:
                queue.append((currNode.right, currSum + currNode.right.val, currArr + [currNode.right.val]))

        return res