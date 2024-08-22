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
        return isValid(root, null, null);        
    }

    public boolean isValid(TreeNode root, TreeNode minNode, TreeNode maxNode){

        if(root == null) return true;

        if(minNode != null && root.val <= minNode.val) return false;
        if(maxNode != null && root.val >= maxNode.val) return false;

        return isValid(root.left, minNode, root) && isValid(root.right, root, maxNode);
    }

}