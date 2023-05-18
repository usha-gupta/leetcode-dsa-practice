package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{9};

        System.out.println("result :: "+ Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int carry =1;
        while( i >= 0){
           int sum = digits[i] + carry;
           if(sum > 9){
               int reminder = sum % 10;
               digits[i] =reminder;
               carry = sum/10;
           } else{
               digits[i] = sum;
               carry =0;
           }
            i--;
        }

        System.out.println("carry :"+carry);
        return digits;
    }
}
