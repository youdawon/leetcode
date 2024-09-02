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

    public boolean isValidTree(TreeNode currNode, TreeNode minNode, TreeNode maxNode){

        if(currNode == null){
            return true;
        }

        if(minNode != null && minNode.val >= currNode.val){
            return false;
        }
        if(maxNode != null && maxNode.val <= currNode.val){
            return false;
        }

        return isValidTree(currNode.left, minNode, currNode) && isValidTree(currNode.right, currNode, maxNode);
    }
}