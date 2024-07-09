# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        self.res = []
        
        def dfs(root):

            if root is None:
                self.res.append("#")
                return

            self.res.append(root.val)
            root.left = dfs(root.left)   
            root.right = dfs(root.right)

        dfs(root)

        return ' '.join(map(str, self.res))

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """ 
        arr = list(map(str, data.split()))

        def createTree(arr):

            if len(arr) == 0:
                return 

            value = arr.pop(0)
            
            if value == "#":
                return

            node = TreeNode(value)
            node.left = createTree(arr)
            node.right = createTree(arr)

            return node

        return createTree(arr)

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))