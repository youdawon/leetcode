# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        #Time : O(N)
        #Space : O(1)
        
        tail = None

        current = head
        while current:
            temp = current.next
            current.next = tail 
            tail = current
            current = temp
        
        return tail