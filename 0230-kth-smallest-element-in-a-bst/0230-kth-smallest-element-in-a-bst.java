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
    public int kthSmallest(TreeNode root, int k) {

        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while(current != null || stack != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            k--;
            TreeNode currNode = stack.pop();
            if(k == 0) return currNode.val;

            if(currNode.right != null) current = currNode.right;
        }             

        return -1;   
    }
}