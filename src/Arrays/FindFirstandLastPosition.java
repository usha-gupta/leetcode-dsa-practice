package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstandLastPosition {
    public static void main(String[] args) {

        int[] nums = new int[] {1};

        System.out.println("result :: "+ Arrays.toString(searchRange(nums, 1)));

        List<Integer[]> list = new ArrayList<>();

    }

    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        if(nums.length < 1){
            return new int[]{start, end};
        }
        int i =0;
        while(i < nums.length && nums[i] <= target){
            if(nums[i] == target){
                start = start == -1 ? i : start;
                end = i;
            }
            i++;
        }
        return new int[]{start, end};
    }
}
