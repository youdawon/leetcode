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
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {

        getDiameter(root);
        
        return max;
    }
    
    public int getDiameter(TreeNode root) {
                
        if(root == null)        
            return -1;
        
        int leftHeight = getDiameter(root.left);
        int rightHeight = getDiameter(root.right);
        
        max = Math.max(leftHeight + rightHeight + 2, max);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}