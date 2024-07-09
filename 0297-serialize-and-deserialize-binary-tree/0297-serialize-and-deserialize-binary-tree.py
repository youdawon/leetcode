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

        #Time Complexity : O(N)
        #Space Complexity : O(N)

        self.res = []
        
        def dfs(root):

            if root is None:
                self.res.append("#")
                return

            self.res.append(str(root.val))
            dfs(root.left)   
            dfs(root.right)

        dfs(root)

        return ' '.join(self.res)

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """ 
        
        #Time Complexity : O(N)
        #Space Complexity : O(N)

        arr = data.split()

        def dfs(arr):

            value = arr.pop(0)
            
            if value == "#":
                return None

            node = TreeNode(value)
            node.left = dfs(arr)
            node.right = dfs(arr)

            return node

        return dfs(arr)

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))