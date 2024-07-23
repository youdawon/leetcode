/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Map<Integer, Integer> map;
    int preIndex = 0;
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;

        map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildTree2(0, inorder.length-1);
    }

    public TreeNode buildTree2(int inStart, int inEnd){
        if(preIndex >= this.preorder.length) return null;
        if(inStart > inEnd) return null;

        TreeNode root = new TreeNode(this.preorder[preIndex++]);
        int rootIndex = map.get(root.val);
        root.left = buildTree2(inStart, rootIndex-1);
        root.right = buildTree2(rootIndex+1, inEnd);

        return root;
    }
}