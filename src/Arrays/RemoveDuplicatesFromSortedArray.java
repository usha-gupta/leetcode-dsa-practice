package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {



    public static void main(String[] args) {
//        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums = new int[]{1,1,2};
        System.out.println("result :: "+removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int i =0;
        int j = i+1;
        while( j < nums.length){
            if(nums[i] != nums[j]){
                 nums[i+1] = nums[j];
                ++i;
            }
            ++j;
        }
        return ++i;
    }

}
