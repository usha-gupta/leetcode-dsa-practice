package Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,1};
        System.out.println("result ::: "+thirdMax(nums));


    }

    public static int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for(int i =0; i < nums.length; i++){
            if(nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if(nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }
        return thirdMax;
    }
}
