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
    
        if(root == null){
            return true;
        }            

        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);
                
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);       
        
        return leftBalanced && rightBalanced && Math.abs(leftDepth-rightDepth) <= 1;
    }
    
    public int getDepth(TreeNode root){
        
        if(root == null)
            return 0;
        
        int leftDepth = getDepth(root.left) + 1;
        int rightDepth = getDepth(root.right) + 1;        
    
        return Math.max(leftDepth, rightDepth);        
    }
}