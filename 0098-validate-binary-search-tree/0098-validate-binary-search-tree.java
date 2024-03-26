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
        
        Stack<Integer> stack = new Stack<Integer>();
        
        setTreeNodeValues(root, stack);
        
        while(!stack.isEmpty() && stack.size() > 1){
            int curValue = stack.pop();
            if(curValue <= stack.peek()){
                return false;
            }
        }
        
        return true;
    }
    
    public void setTreeNodeValues(TreeNode root, Stack<Integer> stack){
        
        if(root == null)
            return;
        
        setTreeNodeValues(root.left, stack);
        stack.add(root.val);
        setTreeNodeValues(root.right, stack);
    }
}