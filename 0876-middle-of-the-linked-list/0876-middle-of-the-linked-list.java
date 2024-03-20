/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode currentNode = head;
        int count = 0;
        
        while(currentNode != null){
            if(currentNode != null)
                count++;
            
            currentNode = currentNode.next;
        }
        
        int centreIndex = count / 2 + 1;
                
        int i = 1;
        currentNode = head;
        
        while(currentNode != null){       
            if(centreIndex == i){
                return currentNode;
            }
            
            currentNode = currentNode.next;
            i++;
        }        
        return currentNode;
    }
}