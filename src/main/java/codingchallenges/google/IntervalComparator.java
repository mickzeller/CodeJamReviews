package codingchallenges.google;

import java.util.*;

public class IntervalComparator implements Comparator<Interval> {

    // Sorting the list makes the runtime O(n log(n)) besides that we
    // only scan the list once which is O(n)
    // Space is O(1)

    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1, 3));
        intervalList.add(new Interval(2, 6));
        intervalList.add(new Interval(8, 10));
        intervalList.add(new Interval(15, 18));

        for (Interval interval : merge(intervalList)) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }

    }

    private static List<Interval> merge(List<Interval> list) {
        Collections.sort(list, new IntervalComparator());

        LinkedList<Interval> merged = new LinkedList<>();
        for (Interval interval : list) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it
            if (merged.isEmpty() || merged.getLast().end < interval.start) {
                merged.add(interval);
            } else {
                // otherwise, there is overlap, so we merge the current and previous
                // intervals.
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }
        return merged;
    }

    @Override
    public int compare(Interval a, Interval b) {
        return Integer.compare(a.start, b.start);
    }
}
