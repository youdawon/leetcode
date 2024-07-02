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
            slow = slow.next
            fast = fast.next.next
    
        tail = None
        current = slow.next

        while current:
            temp = current.next
            current.next = tail
            tail = current
            current = temp

        slow.next = None

        l1_current = head
        l2_current = tail

        while l2_current:
            temp = l1_current.next
            l1_current.next = l2_current
            l1_current = l1_current.next 
            l2_current = temp           

