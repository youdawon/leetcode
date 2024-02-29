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
    public boolean isSameTree(TreeNode p, TreeNode q) {
                
        if((p != null && q == null) || 
          (q != null && p == null)){
            return false;
        } else if(q == null && p == null){
            return true;
        }
                
        if(p.val != q.val)
            return false;
        
        if(!isSameTree(p.left, q.left) || 
          !isSameTree(p.right, q.right))
            return false;
                
        return true;
    }
}