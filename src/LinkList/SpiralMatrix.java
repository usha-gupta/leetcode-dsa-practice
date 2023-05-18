package LinkList;

import java.util.HashMap;
import java.util.Map;

public class SpiralMatrix {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(6, new ListNode(8,new ListNode(1, new ListNode(7, new ListNode(9, new ListNode(4, new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(0)))))))))))));

        System.out.print("list one :: ");
        print(list1);

        System.out.println();

        System.out.print("result :: "+spiralMatrix(3,5, list1));


        Map<Integer, Integer> map = new HashMap<>();



    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        int i =0;
        while(head != null){

            int j =0;
            while(j < n){
                result[i][j] = head.val;
                j++;
                head = head.next;
            }
            i++;
        }
        return result;

    }


    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }
}
