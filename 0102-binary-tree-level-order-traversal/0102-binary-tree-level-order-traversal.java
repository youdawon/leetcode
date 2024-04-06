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
        
        if(root == null)
            return list;

        getLevels(root, list, 0);
        
        return list;        
    }
    
    public void getLevels(TreeNode root, List<List<Integer>> list, int index){
        
        if(root == null)
            return;
        
        if(list.size()-1 >= index){
            list.get(index).add(root.val);            
        } else {
            List<Integer> subList = new ArrayList<>();                                     
            subList.add(root.val);
            list.add(subList);            
        }

        getLevels(root.left, list, index+1);
        getLevels(root.right, list, index+1);        
    }
}