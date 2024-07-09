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
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        
        for (ListNode node : lists){
            if (node != null){
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!minHeap.isEmpty()){
            current.next = minHeap.poll();
            current = current.next;

            if (current.next != null){
                minHeap.add(current.next);
            }
        }

        return dummy.next;
    }
}