# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:

        head = ListNode(-1)
        current = head
        minHeap = []        

        for i in range(len(lists)):
            if lists[i]:
                heapq.heappush(minHeap, (lists[i].val, i, lists[i]))

        while minHeap:
            node = heapq.heappop(minHeap)[2]
            current.next = node
            if node.next:
                i += 1
                heapq.heappush(minHeap, (node.next.val, i, node.next))
            current = current.next

        return head.next