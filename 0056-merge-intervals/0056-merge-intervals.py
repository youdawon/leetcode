class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        intervals.sort()
        result = []

        minInterval, maxInterval = intervals[0][0], intervals[0][1]
        for i in range(1, len(intervals)):
            if maxInterval >= intervals[i][0]:
                minInterval = min(minInterval, intervals[i][0])
                maxInterval = max(maxInterval, intervals[i][1])                
            else:
                result.append([minInterval, maxInterval])
                minInterval, maxInterval = intervals[i][0], intervals[i][1]
        result.append([minInterval, maxInterval])        

        return result