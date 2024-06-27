# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        
        before, after = ListNode(-1), ListNode(-1)
        before_cur, after_cur = before, after        

        while head:
            if head.val >= x:
                after_cur.next = head
                after_cur = after_cur.next
            else:
                before_cur.next = head
                before_cur = before_cur.next
            head = head.next

        after_cur.next = None
        before_cur.next = after.next

        return before.next
