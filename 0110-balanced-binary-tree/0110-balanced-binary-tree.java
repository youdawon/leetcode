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
        return getHeight(root) == -1 ? false : true;
    }
    
    public int getHeight(TreeNode root){
        
        if(root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(leftHeight == -1)
            return -1;
        
        if(rightHeight == -1)
            return -1;        
        
        if(Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}