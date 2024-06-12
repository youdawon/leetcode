# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        ListNode.__eq__ = lambda self, other: self.val == other.val
        ListNode.__lt__ = lambda self, other: self.val < other.val

        minHeap = []
        head = ListNode(0)

        for node in lists:
            if node:
                heapq.heappush(minHeap, (node.val, node))            

        current = head
        
        while minHeap:
            node = heapq.heappop(minHeap)[1]
            current.next = node
            current = current.next
            if node.next:
                heapq.heappush(minHeap, (node.next.val, node.next))

        return head.next
