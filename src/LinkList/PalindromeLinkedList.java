package LinkList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public static void main(String[] args) {
//        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode list1 = new ListNode(1, new ListNode(2));


        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();


        System.out.println("result ::: "+isPalindrome(list1));

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        int i =0, j = list.size()-1;
        while(i < j){
            if(list.get(i) != list.get(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }
}
