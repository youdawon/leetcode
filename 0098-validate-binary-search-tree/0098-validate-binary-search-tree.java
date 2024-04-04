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
        
        Stack<Integer> stack = new Stack<>();
        
        addNodeValues(stack, root);
    
        while(!stack.isEmpty() && stack.size() > 1){
            int curValue = stack.pop();
            if(curValue <= stack.peek())
                return false;
        }            
            
        return true;
    }
    
    public void addNodeValues(Stack<Integer> stack, TreeNode node){
        
        if(node.left != null) addNodeValues(stack, node.left);
        stack.add(node.val);
        if(node.right != null) addNodeValues(stack, node.right);        
    }
}