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
    public boolean isValidBST(TreeNode root) {
        
        
        return isChildValid(root, null, null);
    }

    public boolean isChildValid(TreeNode root, TreeNode minNode, TreeNode maxNode){

        if(root == null)
            return true;
        
        if(minNode != null && minNode.val >= root.val)
            return false;
        
        if(maxNode != null && maxNode.val <= root.val)
            return false;
        
        return isChildValid(root.left, minNode, root) && isChildValid(root.right, root, maxNode);
    }
}