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

            TreeNode tempNode = stack.pop();
            k--;

            if(k == 0) return tempNode.val;

            if(tempNode.right != null) current = tempNode.right;
        }

        return -1;
    }
}