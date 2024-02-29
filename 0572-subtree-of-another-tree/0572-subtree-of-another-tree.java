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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null)
            return false;
                
        if(subRoot.val == root.val){
            if(isTreeSame(root.left, subRoot.left) && isTreeSame(root.right, subRoot.right))            
                return true;
        }
                
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isTreeSame(TreeNode root, TreeNode subRoot){
        
        if(root == null && subRoot == null)
            return true;
        
        if((root != null && subRoot == null) || 
          (root == null && subRoot != null)){
            return false;
        }
        
        if(root.val != subRoot.val){
            return false;
        }
        
        if(isTreeSame(root.left, subRoot.left) &&
          isTreeSame(root.right, subRoot.right))
            return true;
        
        return false;
    }
}