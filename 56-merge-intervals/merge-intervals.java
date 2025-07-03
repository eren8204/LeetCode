import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> lst = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                lst.add(new int[]{start, end});  // Add previous merged interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        lst.add(new int[]{start, end});  // Add the last interval

        // Convert list to array
        return lst.toArray(new int[lst.size()][]);
    }
}
