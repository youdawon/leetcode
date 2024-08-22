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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        levelOrder(result, root, 0);

        return result;        
    }

    public void levelOrder(List<List<Integer>> result, TreeNode root, int level) {

        if(root == null){
            return;
        }

        if(result.size() == level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);      

        levelOrder(result, root.left, level+1);
        levelOrder(result, root.right, level+1);

    }
}