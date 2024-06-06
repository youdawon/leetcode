class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:

        n = len(cost)
        first = cost[0]
        second = cost[1]

        for i in range(2, n):
            curr = cost[i] + min(first, second)
            first = second
            second = curr
        
        return min(first, second)
