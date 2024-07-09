# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root: Optional[TreeNode]) -> str:
        """Encodes a tree to a single string.
        """
        self.arr = []

        def dfs(root):
            if root:
                self.arr.append(root.val)
                dfs(root.left)
                dfs(root.right)            

        dfs(root)

        return ' '.join(map(str, self.arr))
        

    def deserialize(self, data: str) -> Optional[TreeNode]:
        """Decodes your encoded data to tree.
        """
        preorder = list(map(int, data.split()))
        inorder = sorted(preorder)

        def getTree(preorder, inorder):
            if inorder:          
                root = TreeNode(preorder.pop(0))

                rootIndex = inorder.index(root.val)

                root.left = getTree(preorder, inorder[0:rootIndex])
                root.right = getTree(preorder, inorder[rootIndex+1:])                

                return root


        return getTree(preorder, inorder)
        

# Your Codec object will be instantiated and called as such:
# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# tree = ser.serialize(root)
# ans = deser.deserialize(tree)
# return ans