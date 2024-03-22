/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        
        Stack<TreeNode> pStack = new Stack<TreeNode>();
        Stack<TreeNode> qStack = new Stack<TreeNode>();  
        
        pStack = getCommonAncestor(root, p, pStack);
        qStack = getCommonAncestor(root, q, qStack);        
        
        int end = 0;
        
        if(pStack.size() > qStack.size()){
            end = pStack.size();
        } else {
            end = qStack.size();            
        }
        
        int i=0; 
        
        
        while(i < end){
 
            if(pStack.size() > qStack.size()){
                pStack.pop();   
            }
            if(qStack.size() > pStack.size()){
                qStack.pop();   
            }    
            
            if(qStack.size() == pStack.size()){
                if(qStack.peek() == pStack.peek())
                    return qStack.pop();
                
                qStack.pop();
                pStack.pop();
            }
            i++;
        }
        
        return new TreeNode();
    }
    
    public Stack<TreeNode> getCommonAncestor(TreeNode root, TreeNode child, 
                                    Stack<TreeNode> stack){

        stack.push(root);
        
        if(root.val == child.val){
            return stack;
        }
        
        if(root.val > child.val){
            stack = getCommonAncestor(root.left, child, stack);
        } else {
            stack = getCommonAncestor(root.right, child, stack);            
        }        
        
        return stack;
    }
}