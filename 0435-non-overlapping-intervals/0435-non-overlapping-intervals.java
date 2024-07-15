class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1],i2[1]));
        int count = 1;
        int prevIndex = 0;

        for (int i=1; i<intervals.length; i++){
            if(intervals[i][0] >= intervals[prevIndex][1]){
                count++;
                prevIndex = i;
            }
        }

        return intervals.length - count;
    }
}