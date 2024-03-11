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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null)
            return null;
        
        if(root.val == val){
            return root;
        }            
        
        TreeNode leftNode = searchBST(root.left, val);
        TreeNode rightNode = searchBST(root.right, val);
        
        if(leftNode == null && rightNode == null){
            return null;
        } else if(leftNode != null){
            return leftNode;
        } else {
            return rightNode;
        }        
    }
}