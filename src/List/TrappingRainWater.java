package List;

public class TrappingRainWater {

    public static void main(String[] args) {

       int height[] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("result :: "+trap(height));

    }

    public static int trap(int[] height) {

        int left = 0, right = height.length-1;
        int leftMax = 0, rightMax = 0;
        int result=0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else{
                    result+= leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    result+=rightMax - height[right];
                }
                right--;
            }
        }
    return result;
    }
}
