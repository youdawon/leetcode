class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        int count = 0;
        int prev = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            if(prev > intervals[i][0]){
                count++;
            } else {
                prev = intervals[i][1];
            }
        }

        return count;
    }
}