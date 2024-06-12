# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        # ListNode.__eq__ = lambda self, other: self.val == other.val
        # ListNode.__lt__ = lambda self, other: self.val < other.val

        minHeap = []
        head = ListNode(0)

        for i in range(len(lists)):
            if lists[i]:
                heapq.heappush(minHeap, (lists[i].val, i, lists[i]))            

        current = head
        
        while minHeap:
            node = heapq.heappop(minHeap)
            node = node[2]
            current.next = node
            current = current.next
            if node.next:
                i += 1
                heapq.heappush(minHeap, (node.next.val, i, node.next))

        return head.next
