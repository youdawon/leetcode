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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tail = null;
        ListNode current = slow.next;
        slow.next = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = tail;
            tail = current;
            current = temp;
        }
        
        ListNode l1 = head;
        ListNode l2 = tail;

        while(l1 != null && l2 != null){
            ListNode temp = l1.next;
            l1.next = l2;
            l1 = l1.next;            
            l2 = temp;
        }
    }
}