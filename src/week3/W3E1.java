package week3;

import java.lang.reflect.Array;
import java.util.*;

public class W3E1 {

    static void main() {
        W3E1 solver = new W3E1();
        int[][] intervals = {};
        int[] newInterval = {4, 8};
        int[][] ans = solver.insert(intervals, newInterval);
        IO.println(Arrays.toString(ans));
    }


    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayDeque<int[]> updatedIntervals = new ArrayDeque<>();
        boolean inserted = false;

        int i = 0;
        while (i < intervals.length) {
            int[] interval = intervals[i];
            int[] next;

            if (!inserted && newInterval[0] < interval[0]) {
                next = newInterval;
                inserted = true;
            } else {
                next = interval;
                i++;
            }

            insert(next, updatedIntervals);
        }

        if (!inserted) insert(newInterval, updatedIntervals);

        return updatedIntervals.toArray(new int[0][]);
    }

    private void insert(int[] next, ArrayDeque<int[]> updatedIntervals) {

        if (updatedIntervals.isEmpty()) {
            updatedIntervals.add(next);
            return;
        }

        if (overlaps(next, updatedIntervals.peekLast())) {
            updatedIntervals.add(merge(updatedIntervals.pollLast(), next));
        } else {
            updatedIntervals.add(next);
        }
    }

    private boolean overlaps(int[] a, int[] b) {
        return (b[0] >= a[0] && b[0] <= a[1]) || (a[0] >= b[0] && a[0] <= b[1]);
    }

    private int[] merge(int[] a, int[] b) {
        return new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])};
    }
}
