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
        tail = None

        while current:
            temp = current.next
            current.next = tail
            tail = current
            current = temp
        
        link1, link2 = head, tail

        while link1 and link2:
            maxSum = max(maxSum, link1.val + link2.val)
            link1 = link1.next
            link2 = link2.next

        return maxSum 