package LinkList;

import java.util.HashMap;
import java.util.Map;

public class SwapNodesinPairs {
    public static void main(String[] args) {
//        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode list1 = new ListNode(1, new ListNode(2));

        System.out.print("list 1 :::: ");
        print(list1);
        System.out.println();


        System.out.println("result ::: "+hasCycle(list1));
//        print(swapPairs(list1));

        print(deleteDuplicates(list1));


    }

    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }

        Map<Integer, Integer> map = new HashMap();
        ListNode current = head;
        while(current != null){
            if(map.containsKey(current.val)){
                return true;
            }
            map.put(current.val, 1);
        }
        return false;

    }

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = head, current = head.next;
        while(current != null){
            if(prev.val != current.val){
                prev.next = current;
                prev = prev.next;

            }
            if(current.next == null){
                prev.next = null;
            }
            current = current.next;



        }

        return head;
    }

    public static void print(ListNode listNode){
        while (listNode != null){
            System.out.print(" "+listNode.val+" -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode current = head, lastNode = head;
        int counter =1;
        while(current != null){

            if(counter % 2 == 0){
                lastNode.next = current.next;
                current.next = lastNode;
                if(counter == 2){
                    head = current;
                }
                current = current.next;
            } else {
                lastNode = current;
            }
            current = current.next;
            System.out.print(" :: ");
            print(head);
            System.out.println();
            counter++;

        }
        return head;
    }
}
