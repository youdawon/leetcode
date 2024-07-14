class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        
        result = []
        i = 0

        while i < len(intervals) and intervals[i][1] < newInterval[0]:
            result.append(intervals[i])
            i += 1

        minValue, maxValue = newInterval[0], newInterval[1]
        while i < len(intervals) and intervals[i][0] <= newInterval[1]:
            minValue = min(minValue, intervals[i][0])
            maxValue = max(maxValue, intervals[i][1])            
            i += 1

        result.append([minValue, maxValue])

        while i < len(intervals):
            result.append(intervals[i])
            i += 1
            

        return result