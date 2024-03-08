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
    
    int sum;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return false;
        
        if(root.left == null && 
           root.right == null && 
           root.val == targetSum)
            return true;
        
        boolean hasPathSum1 = hasPathSum(root.left, targetSum - root.val);
        boolean hasPathSum2 = hasPathSum(root.right, targetSum - root.val);
        
        if(hasPathSum1 || hasPathSum2){
            return true;
        } else {
            return false;
        }
    }
}