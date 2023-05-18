package Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
//        int nums[] = new int[]{1,3,5,6};
        int nums[] = new int[]{1,3,5,6};
        System.out.println("result :: "+searchInsert(nums, 7));
        System.out.println("result :: "+devidConcure(nums,7, 0, nums.length ));
    }

//    public static int searchInsert(int[] nums, int target) {
//
//        for(int i =0; i < nums.length; i++){
//            if(nums[i] == target){
//                return i;
//            } else if(nums[i] > target){
//                return i;
//            }
//        }
//        return nums.length;
//    }

    public static int searchInsert(int[] nums, int target) {


        for(int i =0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            } else if(nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }
    public static int devidConcure(int[] nums, int target, int start, int end){
        if(end < start){
            return 0;
        }

        int mid = (start+end)/2;

        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target){
            devidConcure(nums, target, start, mid);
        } else{
            devidConcure(nums, target, mid+1,end);
        }
        return 0;
    }
}
