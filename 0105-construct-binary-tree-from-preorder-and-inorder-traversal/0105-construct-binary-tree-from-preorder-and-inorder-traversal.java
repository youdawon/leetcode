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

    int preStart = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) { 
        return buildTree2(preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder, int inStart, int inEnd){

        if(preStart >= preorder.length || inStart > inEnd) return null;

        TreeNode node = new TreeNode(preorder[preStart++]);
        int inIndex = 0;

        for(int i=0; i<inorder.length; i++){
            if(inorder[i] == node.val){
                inIndex = i;
                break;
            }
        }

        node.left = buildTree2(preorder, inorder, inStart, inIndex-1);
        node.right = buildTree2(preorder, inorder, inIndex+1, inEnd);

        return node;
    }
}