package HackerRank;

import java.util.List;

public class Day1 {

    /* Problem1: Given an array of positive integers, return the number of
    elements that are strictly greater than the average of all previous elements.
    Skip the first element.
    Explanation:
    - Day 0: 100 (no previous days, skip)
    - Day 1: 200 > average(100) = 100 → count = 1
    - Day 2: 150 vs average(100, 200) = 150 → not greater → count = 1
    - Day 3: 300 > average(100, 200, 150) = 150 → count = 2 Return 2.
     * */
    List<Integer> responseTimes = List.of(100, 200, 150, 300);
    public int countDaysAboveAverage(List<Integer> responseTimes) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < responseTimes.size(); i++) {
            if (i > 0) {
                double average = (double) sum / i;
                if (responseTimes.get(i) > average) {
                    count++;
                }
            }
            sum += responseTimes.get(i);
        }

        return count;
    }


}
