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
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode tail = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = tail;
            tail = current;
            current = temp;
        }

        return tail;
        
    }
}