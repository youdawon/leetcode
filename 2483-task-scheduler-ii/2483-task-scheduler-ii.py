class Solution:
    def taskSchedulerII(self, tasks: List[int], space: int) -> int:

        if len(tasks) == 1:
            return 1
        
        past = collections.defaultdict(int)
        time = 0

        for i in range(len(tasks)):
            if tasks[i] not in past:
                past[tasks[i]] = time + 1                
            else:
                past[tasks[i]] = time = max(time, past[tasks[i]] + space) + 1
            time = past[tasks[i]]

        return time