package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};

        System.out.println("result :: "+ Arrays.toString(merge(intervals)));

    }

    public static int[][] merge(int[][] intervals) {
        int start =0;
        int end = 0;

        List<Integer[]> list = new ArrayList();

        for(int i = 0; i < intervals.length; i++){
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart < start && currentEnd > end || i == 0){
                list.add(new Integer[]{currentStart, currentEnd});
            } else {

            }
        }

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }

        return result;

    }
}
