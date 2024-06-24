# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        
        fast = head
        slow = head

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        current = slow.next
        tail = None

        while current:
            temp = current.next
            current.next = tail
            tail = current
            current = temp 

        slow.next = None

        node1, node2 = head, tail
        while node2:
            temp = node1.next
            node1.next = node2
            node1 = node1.next
            node2 = temp