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
        self.arr = []

        def dfs(root):
            
            if root is None:
                self.arr.append("#")
                return
            
            self.arr.append(str(root.val))
            dfs(root.left)
            dfs(root.right)

        dfs(root)

        return ' '.join(self.arr)        

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        arr = data.split()

        def dfs(arr):

            num = arr.pop(0)

            if num == "#":
                return None

            node = TreeNode(num)
            node.left = dfs(arr)
            node.right = dfs(arr)

            return node

        return dfs(arr)


        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))