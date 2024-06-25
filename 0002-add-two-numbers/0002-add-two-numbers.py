# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:

        remainder = 0
        root = ListNode(-1)

        current = root

        while l1 or l2 or remainder:
            if l1:
                remainder += l1.val
                l1 = l1.next
            if l2:
                remainder += l2.val
                l2 = l2.next

            remainder, val = divmod(remainder, 10)
            current.next = ListNode(val)
            current = current.next

        return root.next