package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductofArray {

    public static void main(String[] args) {

        int[] nums = new int[] {1,2,3,4};
//        System.out.println("result : "+ Arrays.toString(productExceptSelf(nums)));

        Set<String> set = new HashSet<>();

        set.add("test");
        set.add("test2");



        System.out.println("resulty :: "+set.contains("tet"));

    }

    public static int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] res = new int[len];

        int leftProduct = 1;
        int rightProduct = 1;

        for(int i =0; i < len; i++){
            res[i] = leftProduct;
            leftProduct *= nums[i];
        }
        rightProduct = nums[len-1];
        for(int i = len-2; i >= 0; i--) {
            res[i] = rightProduct * res[i];
            rightProduct *=nums[i];
        }





        return res;

    }
}
