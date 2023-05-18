package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = new int[]{3,3};
        System.out.println("result :: "+removeElement(nums, 3));

    }
    public static int removeElement(int[] nums, int val) {


        int i =0, j=0;
        while (i < j ){
            if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                ++i;
            }
            ++j;
        }
        return ++i;

    }
}
