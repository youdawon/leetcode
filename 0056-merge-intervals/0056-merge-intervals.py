class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:

        res = []
        
        intervals.sort()

        minInterval, maxInterval = intervals[0][0], intervals[0][1]
        for i in range(1, len(intervals)):
            if maxInterval < intervals[i][0]:
                res.append([minInterval, maxInterval])        
                minInterval = intervals[i][0]
                maxInterval = intervals[i][1]                
            else:       
                minInterval = min(minInterval, intervals[i][0])
                maxInterval = max(maxInterval, intervals[i][1])
        res.append([minInterval, maxInterval])

        return res