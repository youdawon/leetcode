# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        
        maxSum = 0

        fast, slow = head, head

        while fast:
            fast = fast.next.next
            slow = slow.next

        current = slow
        prev = None

        while current:            
            temp = current.next
            current.next = prev
            prev = current
            current = temp
        
        while head and prev:
            maxSum = max(maxSum, head.val + prev.val)
            head = head.next
            prev = prev.next

        return maxSum 