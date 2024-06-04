class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:

        minValue = -inf
        minCost = [0]*(len(cost) + 1)
        minCost[0] = 0
        minCost[1] = cost[0]

        for i in range(1, len(cost)):
            minCost[i+1] = cost[i] + min(minCost[i], minCost[i-1])

        return min(minCost[-1], minCost[-2])
