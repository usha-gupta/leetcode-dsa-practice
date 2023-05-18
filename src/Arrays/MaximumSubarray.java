package Arrays;

import java.util.HashMap;

public class MaximumSubarray {
    public static void main(String[] args) {

//        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
//
//        System.out.println();
//        int result = maxSubArray(nums);
//        System.out.println("result is : "+result);
//
//        String s = "87gvg";
//        int num = (int) s.charAt(0);


        System.out.println("int min ::: "+Integer.MIN_VALUE);
        System.out.println("int max ::: "+Integer.MAX_VALUE);

        System.out.println("double min ::: "+Double.MIN_VALUE);
        System.out.println("double max ::: "+Double.MIN_VALUE);
        String str = "e34";
        char num = str.charAt(0);

        String allowed = "e";

        System.out.println("res ::: "+ str.toUpperCase());

       int[] val = new int[] {7,8,9};


       int size  = val.length;


    }

    public static int maxSubArray(int[] nums) {
        System.out.println();
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);

            if (currentSum > maxSum) {
                System.out.print(nums[i]+" --> ");
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
