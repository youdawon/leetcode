class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        int[] newInterval = result.get(0);
        for(int[] interval : intervals){
            if (newInterval[1] < interval[0]){
                newInterval = interval;
                result.add(newInterval);
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);                
            }
        }        

        return result.toArray(new int[result.size()][]);
    }
}