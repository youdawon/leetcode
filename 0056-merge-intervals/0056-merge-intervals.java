class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        int i=1;

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int[] newInterval = intervals[0];
        while(i < intervals.length){
            if(newInterval[1] < intervals[i][0]){
                result.add(newInterval);
                newInterval = intervals[i];
            } {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);            
            }
            i++;
        }       
        result.add(newInterval); 

        return result.toArray(new int[result.size()][]); 
    }
}