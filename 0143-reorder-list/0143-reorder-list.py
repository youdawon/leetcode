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

        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = head        

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        tail = None
        current = slow.next
        slow.next = None

        while current:
            temp = current.next
            current.next = tail 
            tail = current
            current = temp

        l1 = dummy.next
        l2 = tail

        while l1 and l2:
            temp = l1.next
            l1.next = l2
            l1 = l1.next
            l2 = temp 
        
        return head.next