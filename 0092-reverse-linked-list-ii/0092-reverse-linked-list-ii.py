# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:

        dummy = ListNode(-1)
        dummy.next = head
        current = dummy

        for _ in range(left-1):
            current = current.next

        tail = current.next

        for _ in range(left, right):
            temp = current.next
            current.next = tail.next
            tail.next = tail.next.next
            current.next.next = temp

        return dummy.next
