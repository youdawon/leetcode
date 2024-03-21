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
    public boolean isBalanced(TreeNode root) {        
        return getDepth(root) != -1;
    }
    
    public int getDepth(TreeNode root){
        
        if(root == null)
            return 0;
        
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        
        if(leftDepth == -1 || rightDepth == -1)
            return -1;

        if(Math.abs(leftDepth - rightDepth) > 1)
            return -1;
        
        return Math.max(leftDepth, rightDepth) + 1;       
    }
}