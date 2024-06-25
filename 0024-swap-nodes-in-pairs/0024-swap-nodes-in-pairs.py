# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:

        dummy = ListNode(-1)
        dummy.next = head
        current = dummy

        while current.next and current.next.next:
            first, second = current.next, current.next.next
            current.next = second
            first.next = second.next
            second.next = first
            current = current.next.next
        
        return dummy.next