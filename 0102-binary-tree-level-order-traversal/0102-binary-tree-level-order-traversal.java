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
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();        
                    
        addInteger(root, list, 0);
        
        return list;
    }
    
    public void addInteger(TreeNode root, List<List<Integer>> list, int i){
        
        List<Integer> integerList = null;
        
        if(root == null)
            return;
        
        if(list.size() == i){
            list.add(new ArrayList<Integer>());
        }
        
        list.get(i).add(root.val);
                
        addInteger(root.left, list, i+1);
        addInteger(root.right, list, i+1);
    }
}