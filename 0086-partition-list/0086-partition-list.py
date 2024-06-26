# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        
        dummy = ListNode(-1)
        dummy.next = head
        greater = ListNode(-1)    

        current = dummy    
        tail = greater

        while current and current.next:
            if current.next.val >= x:
                temp = current.next
                current.next = current.next.next
                tail.next = temp      
                tail = tail.next
                tail.next = None
            else:
                current = current.next          

        if greater:
            current.next = greater.next

        return dummy.next
