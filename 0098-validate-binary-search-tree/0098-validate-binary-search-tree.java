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
        return isValidTree(root, null, null);
    }
    
    public boolean isValidTree(TreeNode root, TreeNode minNode, TreeNode maxNode){
        
        if(root == null)
            return true;
        if(minNode != null && minNode.val >= root.val)
            return false;
        if(maxNode != null && maxNode.val <= root.val)
            return false;        
        
        
        return isValidTree(root.left, minNode, root) && isValidTree(root.right, root, maxNode);
    }
}