package LinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        print(head);

        System.out.println("result :: " +reverseBetween(head, 2, 4));
    }

    public static void print(ListNode listNode) {
        System.out.println();
        while (listNode != null) {
            System.out.print(" " + listNode.val + " -> ");
            listNode = listNode.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode startPrev = null, start = null, end = null, endAfter = null;
        ListNode current = head, prev = null;
        int count = 1;
        while(current != null){
            if(count == left){
                startPrev = prev;
                start = current;
            }
            if(count == right){
                end = current;
                endAfter = current.next;
                break;
            }

            prev = current;
            current = current.next;
            ++count;
        }
//        System.out.println("-------");
//        System.out.println("startPrev :: "+startPrev.val);
//        print(startPrev);
//        System.out.println("-------");
//        System.out.println("start :: "+start.val);
//        print(start);
//        System.out.println("-------");
//        System.out.println("endAfter :: "+(endAfter != null ? endAfter.val : 0));
//        print(endAfter);
//        System.out.println("-------");
//        System.out.println("end :: "+end.val);
//        print(end);
//        System.out.println("-------");
        // System.out.println("current :: "+current.val);

        startPrev.next = end;
        start.next = endAfter;


//        System.out.println("result :::");
//        print(head);
        ListNode newHead = start;
        current = start;
        prev = null;
        end.next = null;
        System.out.println("-------");
        System.out.println("current :: "+start.val);
        print(current);
        System.out.println("-------");
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        System.out.println("new haed ::");
        print(newHead);

        return head;
    }
}
